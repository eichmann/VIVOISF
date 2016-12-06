package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartPublicationVenueForIterator theDocumentPartPublicationVenueForIterator = (DocumentPartPublicationVenueForIterator)findAncestorWithClass(this, DocumentPartPublicationVenueForIterator.class);
			pageContext.getOut().print(theDocumentPartPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

