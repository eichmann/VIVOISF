package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentShortDescriptionIterator theLegalDocument = (LegalDocumentShortDescriptionIterator)findAncestorWithClass(this, LegalDocumentShortDescriptionIterator.class);
			pageContext.getOut().print(theLegalDocument.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

