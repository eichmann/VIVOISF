package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHasPublicationVenueIterator theDocumentHasPublicationVenueIterator = (DocumentHasPublicationVenueIterator)findAncestorWithClass(this, DocumentHasPublicationVenueIterator.class);
			pageContext.getOut().print(theDocumentHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

