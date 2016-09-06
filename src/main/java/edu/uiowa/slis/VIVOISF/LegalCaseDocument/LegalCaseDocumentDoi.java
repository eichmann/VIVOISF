package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentDoiIterator theLegalCaseDocument = (LegalCaseDocumentDoiIterator)findAncestorWithClass(this, LegalCaseDocumentDoiIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for doi tag ");
		}
		return SKIP_BODY;
	}
}

