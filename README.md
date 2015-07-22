# Snow Owl

## Introduction
Snow Owl is a terminology server and a collaborative terminology authoring platform.  The authoring platform maintains terminology artifacts developed by a team and supported by business workflows that are driven by external task management systems like Bugzilla and JIRA.  With its modular design, the server can maintain multiple terminologies where new terminologies can be plugged-in to the platform.  The functionality of Snow Owl is exposed via a REST API.

## Java

The required JDK version is Java 7 update 55 or later.

## Dev

Snow Owl is an Equinox-OSGi based server (using either Virgo or standalone OSGi). To develop plug-ins for Snow Owl you need to use Eclipse as IDE: 
* Use latest Modeling Luna version http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/lunasr2

Required Eclipse plug-ins (install the listed features):

*Note: you may have to untick the `Show only the latest versions of the available software` checkbox to get older versions of a feature.*

* Groovy (http://dist.springsource.org/release/GRECLIPSE/e4.4/)
 * Groovy-Eclipse
 * Extra Groovy compilers > Groovy compiler 2.0 feature
* Xtext/Xtend (http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/)
 * MWE 2 Language SDK 2.6.1
 * Xtend SDK 2.6.2
 * Xtext SDK 2.6.2
* Optional: Maven integration (http://download.eclipse.org/technology/m2e/releases) 
 
### Eclipse Preferences

Make sure you have the following preferences enabled/disabled.
* Groovy compiler level is set to 2.0.7 (Preferences > Groovy > Compiler)
* 'Enable checking for mismatches between the project an workspace Groovy compiler levels' is checked under Preferences > Groovy > Compiler. (If you have error in any of the Groovy projects with 'compiler mismatch' message then you can fix at project properties > Groovy Compiler > set compiler level to 2.0)
* Plug-in development API baseline errors is set to Ignored (Preferences > Plug-in Development > API Baselines)

### Target platform

1. Create a prefetched target platform and copy the contents of the `target_platform_<version>` directory under `<eclipse_home>/target_platform`.
2. (Re)Open Eclipse and find the `com.b2international.snowowl.server.target.update` project
3. Open the file: `com.b2international.snowowl.server.local.target`
4. Click on `Set as Target platform`

### Run from development environment

1. Find `com.b2international.snowowl.server.update` project
2. Open `so_server.product` file, click on `Run as Eclipse application` and terminate it
3. Open Run Configurations and find the launch config `so_server.product`
4. Open Arguments tab
 * Add `-Djetty.home.bundle=org.eclipse.jetty.osgi.boot` to the end of VM arguments
5. Open Plug-ins tab
 1. Add `org.eclipse.jetty.osgi.boot` bundle (set Auto-Start to `true`, and Start Level to `5`)
 2. Click on Add required bundles
 3. Remove `org.eclipse.equinox.http.jetty`, `org.eclipse.jetty.annotations`, all `*jsp*` and `*jasper*` bundles
 4. Set the API bundles to start automatically (`com.b2international.snowowl.api.rest`, `com.b2international.snowowl.snomed.api.rest`) by setting Auto-Start to `true`, and Start Level to `5`.
 5. Add the `com.sun.el` bundle and remove the `org.apache.el` bundle if necessary
6. Run and point your browser to `http://localhost:8080/snowowl/snomed-ct/v2/`
7. By default Snow Owl will use an empty embedded `H2` database. To use `MySQL`, you have to configure the database in the `snowowl_config.yml` configuration file (or copy an existing `MySQL` or `H2` configuration file located in the `releng/com.b2international.snowowl.server.update/assembly/mysql or h2` directory to `<eclipse_home>/target_platform`).

## Build

Snow Owl uses Maven for its build system.

In order to create a distribution, simply run the `mvn clean package -Pdependencies -Psite -Pdist` command in the cloned directory.

To run the test cases, simply run:

    mvn clean verify -Pdependencies -Psite -Pdist

The distribution package can be found in the `releng/distribution/target` folder, when the build completes.

### Additional Build Improvements

Here are few tips to improve the quality of the default build process.

#### Nexus

We highly recommend to install a local artifact repository (`Nexus OSS` is supported), so the build can deploy and reuse (in downstream projects) `Maven` and `p2` artifacts.

1. Download and install Nexus OSS or Professional (http://www.sonatype.org/nexus/go/).
2. Install `Nexus Unzip Plugin` to easily reference p2 repositories deployed as zip: https://wiki.eclipse.org/Tycho/Nexus_Unzip_Plugin
3. Define the `nexus.url` parameter in the `settings.xml` file under `.m2` folder on your build server (use the `settings.xml` in the root of this repository as template).
4. Define a deployment user in Nexus, and reference it in the `.m2/settings.xml` file.
5. Use `mvn clean deploy` instead of `mvn clean verify` when you execute the process.
6. *Optional: deploy only if build succeeds (requires a `Jenkins CI` job with post build step to deploy artifacts to `Nexus`*

#### Prefetched target platform

The `-Pdependencies` profile includes all required third party repositories and modules as part of the build process using Tycho's p2 and Maven dependency resolution capabilities. 
While this should be enough to run the process, in production builds we recommend using a prefetched target platform, as it will ensure consistent third party versions and reduces the execution time significantly.

1. Create the target platform update site, run `mvn clean verify -Pdependencies -Ptarget_site` from the **releng** folder
2. Navigate to `com.b2international.snowowl.server.target.update/target` folder
3. Copy the `target_platform_<version>` folder to a webserver, or use `Nexus` to serve the site as unzipped p2 (requires Nexus OSS with Unzip Plugin installed, see previous section)
4. Define an `http` URL as `target.platform.url` parameter in the global Maven `.m2/settings.xml` file
5. Run Snow Owl maven process with `mvn clean verify -Ptp_dependencies -Psite -Pdist` (*NOTE: the tp_dependencies profile will use the prefetched local p2 repository instead of querying all remote sites*)
