package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentGtin14Iterator theLegalDocument = (LegalDocumentGtin14Iterator)findAncestorWithClass(this, LegalDocumentGtin14Iterator.class);
			pageContext.getOut().print(theLegalDocument.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

