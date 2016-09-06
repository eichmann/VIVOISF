package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			if (!theSlideshow.commitNeeded) {
				pageContext.getOut().print(theSlideshow.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			return theSlideshow.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Slideshow for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			theSlideshow.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for label tag ");
		}
	}
}

