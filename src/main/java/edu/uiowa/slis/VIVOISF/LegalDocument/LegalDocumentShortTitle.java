package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentShortTitleIterator theLegalDocument = (LegalDocumentShortTitleIterator)findAncestorWithClass(this, LegalDocumentShortTitleIterator.class);
			pageContext.getOut().print(theLegalDocument.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

