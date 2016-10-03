package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentUri currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentUriIterator theLegalCaseDocument = (LegalCaseDocumentUriIterator)findAncestorWithClass(this, LegalCaseDocumentUriIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for uri tag ");
		}
		return SKIP_BODY;
	}
}

