package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowCodeDBPediaIDIterator theSlideshow = (SlideshowCodeDBPediaIDIterator)findAncestorWithClass(this, SlideshowCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theSlideshow.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

