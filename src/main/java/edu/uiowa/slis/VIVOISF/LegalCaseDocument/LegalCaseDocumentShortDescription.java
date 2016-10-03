package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentShortDescriptionIterator theLegalCaseDocument = (LegalCaseDocumentShortDescriptionIterator)findAncestorWithClass(this, LegalCaseDocumentShortDescriptionIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

