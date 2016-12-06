package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNationalityZHIterator theSlideshow = (SlideshowNationalityZHIterator)findAncestorWithClass(this, SlideshowNationalityZHIterator.class);
			pageContext.getOut().print(theSlideshow.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

