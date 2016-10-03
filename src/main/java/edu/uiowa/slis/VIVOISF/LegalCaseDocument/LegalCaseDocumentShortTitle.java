package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentShortTitleIterator theLegalCaseDocument = (LegalCaseDocumentShortTitleIterator)findAncestorWithClass(this, LegalCaseDocumentShortTitleIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

