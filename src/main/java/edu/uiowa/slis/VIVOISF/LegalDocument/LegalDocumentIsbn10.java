package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentIsbn10Iterator theLegalDocument = (LegalDocumentIsbn10Iterator)findAncestorWithClass(this, LegalDocumentIsbn10Iterator.class);
			pageContext.getOut().print(theLegalDocument.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

