package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentGtin14Iterator theLegalCaseDocument = (LegalCaseDocumentGtin14Iterator)findAncestorWithClass(this, LegalCaseDocumentGtin14Iterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

