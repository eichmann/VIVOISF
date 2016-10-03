package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentContent currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentContentIterator theLegalDocument = (LegalDocumentContentIterator)findAncestorWithClass(this, LegalDocumentContentIterator.class);
			pageContext.getOut().print(theLegalDocument.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for content tag ");
		}
		return SKIP_BODY;
	}
}

