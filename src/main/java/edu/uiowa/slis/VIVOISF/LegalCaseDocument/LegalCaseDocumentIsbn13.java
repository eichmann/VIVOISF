package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentIsbn13Iterator theLegalCaseDocument = (LegalCaseDocumentIsbn13Iterator)findAncestorWithClass(this, LegalCaseDocumentIsbn13Iterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

