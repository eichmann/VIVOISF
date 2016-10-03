package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentAsinIterator theLegalDocument = (LegalDocumentAsinIterator)findAncestorWithClass(this, LegalDocumentAsinIterator.class);
			pageContext.getOut().print(theLegalDocument.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for asin tag ");
		}
		return SKIP_BODY;
	}
}

