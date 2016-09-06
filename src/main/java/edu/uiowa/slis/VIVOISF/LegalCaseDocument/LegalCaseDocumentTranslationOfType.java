package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentTranslationOfIterator theLegalCaseDocumentTranslationOfIterator = (LegalCaseDocumentTranslationOfIterator)findAncestorWithClass(this, LegalCaseDocumentTranslationOfIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

