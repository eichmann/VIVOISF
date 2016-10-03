package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentPages currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentPagesIterator theLegalDocument = (LegalDocumentPagesIterator)findAncestorWithClass(this, LegalDocumentPagesIterator.class);
			pageContext.getOut().print(theLegalDocument.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for pages tag ");
		}
		return SKIP_BODY;
	}
}

