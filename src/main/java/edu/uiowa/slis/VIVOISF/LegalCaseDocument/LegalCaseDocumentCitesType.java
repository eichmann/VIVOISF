package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentCitesIterator theLegalCaseDocumentCitesIterator = (LegalCaseDocumentCitesIterator)findAncestorWithClass(this, LegalCaseDocumentCitesIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for cites tag ");
		}
		return SKIP_BODY;
	}
}

