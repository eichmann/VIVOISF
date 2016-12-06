package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowRelatesIterator theSlideshowRelatesIterator = (SlideshowRelatesIterator)findAncestorWithClass(this, SlideshowRelatesIterator.class);
			pageContext.getOut().print(theSlideshowRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for relates tag ");
		}
		return SKIP_BODY;
	}
}

