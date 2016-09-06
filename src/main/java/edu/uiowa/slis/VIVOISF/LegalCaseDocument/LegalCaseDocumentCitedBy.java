package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentCitedByIterator theLegalCaseDocumentCitedByIterator = (LegalCaseDocumentCitedByIterator)findAncestorWithClass(this, LegalCaseDocumentCitedByIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

