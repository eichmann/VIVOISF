package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentCitedByIterator theLegalDocumentCitedByIterator = (LegalDocumentCitedByIterator)findAncestorWithClass(this, LegalDocumentCitedByIterator.class);
			pageContext.getOut().print(theLegalDocumentCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

