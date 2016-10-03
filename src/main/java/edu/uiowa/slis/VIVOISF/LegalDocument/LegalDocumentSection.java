package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentSection currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentSectionIterator theLegalDocument = (LegalDocumentSectionIterator)findAncestorWithClass(this, LegalDocumentSectionIterator.class);
			pageContext.getOut().print(theLegalDocument.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for section tag ");
		}
		return SKIP_BODY;
	}
}

