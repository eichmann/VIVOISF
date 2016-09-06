package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentTranslationOfIterator theLegalDocumentTranslationOfIterator = (LegalDocumentTranslationOfIterator)findAncestorWithClass(this, LegalDocumentTranslationOfIterator.class);
			pageContext.getOut().print(theLegalDocumentTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

