package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookPublicationVenueForIterator theBookPublicationVenueForIterator = (BookPublicationVenueForIterator)findAncestorWithClass(this, BookPublicationVenueForIterator.class);
			pageContext.getOut().print(theBookPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

