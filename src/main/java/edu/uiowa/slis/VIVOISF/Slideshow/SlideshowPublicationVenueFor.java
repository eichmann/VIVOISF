package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowPublicationVenueForIterator theSlideshowPublicationVenueForIterator = (SlideshowPublicationVenueForIterator)findAncestorWithClass(this, SlideshowPublicationVenueForIterator.class);
			pageContext.getOut().print(theSlideshowPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

