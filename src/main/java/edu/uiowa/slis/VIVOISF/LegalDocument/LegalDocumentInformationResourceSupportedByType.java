package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentInformationResourceSupportedByIterator theLegalDocumentInformationResourceSupportedByIterator = (LegalDocumentInformationResourceSupportedByIterator)findAncestorWithClass(this, LegalDocumentInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theLegalDocumentInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

