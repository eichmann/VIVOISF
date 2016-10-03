package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentSection currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentSectionIterator theLegalCaseDocument = (LegalCaseDocumentSectionIterator)findAncestorWithClass(this, LegalCaseDocumentSectionIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for section tag ");
		}
		return SKIP_BODY;
	}
}

