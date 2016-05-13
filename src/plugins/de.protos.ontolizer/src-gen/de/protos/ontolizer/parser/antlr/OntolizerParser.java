/*
 * generated by Xtext 2.9.2
 */
package de.protos.ontolizer.parser.antlr;

import com.google.inject.Inject;
import de.protos.ontolizer.parser.antlr.internal.InternalOntolizerParser;
import de.protos.ontolizer.services.OntolizerGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class OntolizerParser extends AbstractAntlrParser {

	@Inject
	private OntolizerGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalOntolizerParser createParser(XtextTokenStream stream) {
		return new InternalOntolizerParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public OntolizerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OntolizerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
