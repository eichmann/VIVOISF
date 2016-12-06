package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			if (!theSlideshow.commitNeeded) {
				pageContext.getOut().print(theSlideshow.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			return theSlideshow.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Slideshow for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			theSlideshow.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for abbreviation tag ");
		}
	}
}

