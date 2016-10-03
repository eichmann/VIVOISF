package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentPageEndIterator theLegalCaseDocument = (LegalCaseDocumentPageEndIterator)findAncestorWithClass(this, LegalCaseDocumentPageEndIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

