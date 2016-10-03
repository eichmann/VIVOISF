package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentPages currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentPagesIterator theLegalCaseDocument = (LegalCaseDocumentPagesIterator)findAncestorWithClass(this, LegalCaseDocumentPagesIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for pages tag ");
		}
		return SKIP_BODY;
	}
}

