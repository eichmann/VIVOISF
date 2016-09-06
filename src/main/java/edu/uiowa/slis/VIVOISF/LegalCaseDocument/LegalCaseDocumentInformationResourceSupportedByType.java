package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentInformationResourceSupportedByIterator theLegalCaseDocumentInformationResourceSupportedByIterator = (LegalCaseDocumentInformationResourceSupportedByIterator)findAncestorWithClass(this, LegalCaseDocumentInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

