package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentHandleIterator theLegalCaseDocument = (LegalCaseDocumentHandleIterator)findAncestorWithClass(this, LegalCaseDocumentHandleIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for handle tag ");
		}
		return SKIP_BODY;
	}
}

