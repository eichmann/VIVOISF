package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentAsinIterator theLegalCaseDocument = (LegalCaseDocumentAsinIterator)findAncestorWithClass(this, LegalCaseDocumentAsinIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for asin tag ");
		}
		return SKIP_BODY;
	}
}

