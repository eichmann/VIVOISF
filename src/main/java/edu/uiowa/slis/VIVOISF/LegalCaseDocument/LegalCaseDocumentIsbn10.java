package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentIsbn10Iterator theLegalCaseDocument = (LegalCaseDocumentIsbn10Iterator)findAncestorWithClass(this, LegalCaseDocumentIsbn10Iterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

