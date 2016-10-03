package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentHandleIterator theLegalDocument = (LegalDocumentHandleIterator)findAncestorWithClass(this, LegalDocumentHandleIterator.class);
			pageContext.getOut().print(theLegalDocument.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for handle tag ");
		}
		return SKIP_BODY;
	}
}

