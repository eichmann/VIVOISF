package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentHasTranslationIterator theLegalDocumentHasTranslationIterator = (LegalDocumentHasTranslationIterator)findAncestorWithClass(this, LegalDocumentHasTranslationIterator.class);
			pageContext.getOut().print(theLegalDocumentHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

