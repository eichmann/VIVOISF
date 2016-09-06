package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentTranslatorIterator theLegalDocumentTranslatorIterator = (LegalDocumentTranslatorIterator)findAncestorWithClass(this, LegalDocumentTranslatorIterator.class);
			pageContext.getOut().print(theLegalDocumentTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for translator tag ");
		}
		return SKIP_BODY;
	}
}

