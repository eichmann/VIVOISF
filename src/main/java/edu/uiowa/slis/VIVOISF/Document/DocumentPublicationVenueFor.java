package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPublicationVenueForIterator theDocumentPublicationVenueForIterator = (DocumentPublicationVenueForIterator)findAncestorWithClass(this, DocumentPublicationVenueForIterator.class);
			pageContext.getOut().print(theDocumentPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

