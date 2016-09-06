package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideReproducesIterator theSlideReproducesIterator = (SlideReproducesIterator)findAncestorWithClass(this, SlideReproducesIterator.class);
			pageContext.getOut().print(theSlideReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

