package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentInformationResourceSupportedByIterator theDocumentInformationResourceSupportedByIterator = (DocumentInformationResourceSupportedByIterator)findAncestorWithClass(this, DocumentInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theDocumentInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

