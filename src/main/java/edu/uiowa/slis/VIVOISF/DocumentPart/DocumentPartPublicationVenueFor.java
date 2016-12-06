package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartPublicationVenueForIterator theDocumentPartPublicationVenueForIterator = (DocumentPartPublicationVenueForIterator)findAncestorWithClass(this, DocumentPartPublicationVenueForIterator.class);
			pageContext.getOut().print(theDocumentPartPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

