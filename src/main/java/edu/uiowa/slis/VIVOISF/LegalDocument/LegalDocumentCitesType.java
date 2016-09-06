package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentCitesIterator theLegalDocumentCitesIterator = (LegalDocumentCitesIterator)findAncestorWithClass(this, LegalDocumentCitesIterator.class);
			pageContext.getOut().print(theLegalDocumentCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for cites tag ");
		}
		return SKIP_BODY;
	}
}

