package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentUpcIterator theLegalCaseDocument = (LegalCaseDocumentUpcIterator)findAncestorWithClass(this, LegalCaseDocumentUpcIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for upc tag ");
		}
		return SKIP_BODY;
	}
}

