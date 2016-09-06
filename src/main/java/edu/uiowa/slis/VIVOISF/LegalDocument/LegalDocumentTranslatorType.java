package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentTranslatorIterator theLegalDocumentTranslatorIterator = (LegalDocumentTranslatorIterator)findAncestorWithClass(this, LegalDocumentTranslatorIterator.class);
			pageContext.getOut().print(theLegalDocumentTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for translator tag ");
		}
		return SKIP_BODY;
	}
}

