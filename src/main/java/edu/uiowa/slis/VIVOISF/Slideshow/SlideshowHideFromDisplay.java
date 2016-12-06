package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			if (!theSlideshow.commitNeeded) {
				pageContext.getOut().print(theSlideshow.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			return theSlideshow.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Slideshow for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Slideshow theSlideshow = (Slideshow)findAncestorWithClass(this, Slideshow.class);
			theSlideshow.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hideFromDisplay tag ");
		}
	}
}

