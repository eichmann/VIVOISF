package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentPmidIterator theLegalDocument = (LegalDocumentPmidIterator)findAncestorWithClass(this, LegalDocumentPmidIterator.class);
			pageContext.getOut().print(theLegalDocument.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for pmid tag ");
		}
		return SKIP_BODY;
	}
}

