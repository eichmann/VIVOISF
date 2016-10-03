package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentUpcIterator theLegalDocument = (LegalDocumentUpcIterator)findAncestorWithClass(this, LegalDocumentUpcIterator.class);
			pageContext.getOut().print(theLegalDocument.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for upc tag ");
		}
		return SKIP_BODY;
	}
}

