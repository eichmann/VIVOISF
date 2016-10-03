package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentNumberIterator theLegalCaseDocument = (LegalCaseDocumentNumberIterator)findAncestorWithClass(this, LegalCaseDocumentNumberIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for number tag ");
		}
		return SKIP_BODY;
	}
}

