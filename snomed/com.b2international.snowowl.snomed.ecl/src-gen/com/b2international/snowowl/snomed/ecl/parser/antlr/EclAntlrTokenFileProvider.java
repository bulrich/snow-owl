/*
 * generated by Xtext
 */
package com.b2international.snowowl.snomed.ecl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EclAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/b2international/snowowl/snomed/ecl/parser/antlr/internal/InternalEcl.tokens");
	}
}