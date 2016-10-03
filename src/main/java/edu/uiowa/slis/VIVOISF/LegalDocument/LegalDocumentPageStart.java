package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentPageStartIterator theLegalDocument = (LegalDocumentPageStartIterator)findAncestorWithClass(this, LegalDocumentPageStartIterator.class);
			pageContext.getOut().print(theLegalDocument.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

