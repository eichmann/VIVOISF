package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			if (!theSlideshow.commitNeeded) {
				pageContext.getOut().print(theSlideshow.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			return theSlideshow.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Slideshow for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			theSlideshow.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for placeOfPublication tag ");
		}
	}
}

