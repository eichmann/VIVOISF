package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentStatusIterator theLegalCaseDocumentStatusIterator = (LegalCaseDocumentStatusIterator)findAncestorWithClass(this, LegalCaseDocumentStatusIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for status tag ");
		}
		return SKIP_BODY;
	}
}

