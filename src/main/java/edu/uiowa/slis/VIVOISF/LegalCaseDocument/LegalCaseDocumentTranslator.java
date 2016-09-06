package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentTranslatorIterator theLegalCaseDocumentTranslatorIterator = (LegalCaseDocumentTranslatorIterator)findAncestorWithClass(this, LegalCaseDocumentTranslatorIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for translator tag ");
		}
		return SKIP_BODY;
	}
}

