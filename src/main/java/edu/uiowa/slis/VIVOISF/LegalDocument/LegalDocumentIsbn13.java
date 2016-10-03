package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentIsbn13Iterator theLegalDocument = (LegalDocumentIsbn13Iterator)findAncestorWithClass(this, LegalDocumentIsbn13Iterator.class);
			pageContext.getOut().print(theLegalDocument.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

