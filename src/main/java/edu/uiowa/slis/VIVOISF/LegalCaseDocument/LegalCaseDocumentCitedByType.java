package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentCitedByIterator theLegalCaseDocumentCitedByIterator = (LegalCaseDocumentCitedByIterator)findAncestorWithClass(this, LegalCaseDocumentCitedByIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

