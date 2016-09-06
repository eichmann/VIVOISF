package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartInformationResourceSupportedByIterator theDocumentPartInformationResourceSupportedByIterator = (DocumentPartInformationResourceSupportedByIterator)findAncestorWithClass(this, DocumentPartInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theDocumentPartInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

