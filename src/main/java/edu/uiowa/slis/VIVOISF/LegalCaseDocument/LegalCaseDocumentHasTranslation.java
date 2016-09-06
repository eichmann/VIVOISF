package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentHasTranslationIterator theLegalCaseDocumentHasTranslationIterator = (LegalCaseDocumentHasTranslationIterator)findAncestorWithClass(this, LegalCaseDocumentHasTranslationIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

