package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentPageStartIterator theLegalCaseDocument = (LegalCaseDocumentPageStartIterator)findAncestorWithClass(this, LegalCaseDocumentPageStartIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

