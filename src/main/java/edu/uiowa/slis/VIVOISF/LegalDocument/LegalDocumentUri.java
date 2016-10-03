package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentUri currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentUriIterator theLegalDocument = (LegalDocumentUriIterator)findAncestorWithClass(this, LegalDocumentUriIterator.class);
			pageContext.getOut().print(theLegalDocument.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for uri tag ");
		}
		return SKIP_BODY;
	}
}

