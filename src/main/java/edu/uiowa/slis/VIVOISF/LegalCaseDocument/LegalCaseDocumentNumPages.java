package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentNumPagesIterator theLegalCaseDocument = (LegalCaseDocumentNumPagesIterator)findAncestorWithClass(this, LegalCaseDocumentNumPagesIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for numPages tag ");
		}
		return SKIP_BODY;
	}
}

