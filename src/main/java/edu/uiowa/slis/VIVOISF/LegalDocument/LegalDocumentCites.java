package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentCites currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentCitesIterator theLegalDocumentCitesIterator = (LegalDocumentCitesIterator)findAncestorWithClass(this, LegalDocumentCitesIterator.class);
			pageContext.getOut().print(theLegalDocumentCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for cites tag ");
		}
		return SKIP_BODY;
	}
}

