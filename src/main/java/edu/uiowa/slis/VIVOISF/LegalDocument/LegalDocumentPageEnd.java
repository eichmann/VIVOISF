package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentPageEndIterator theLegalDocument = (LegalDocumentPageEndIterator)findAncestorWithClass(this, LegalDocumentPageEndIterator.class);
			pageContext.getOut().print(theLegalDocument.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

