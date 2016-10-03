package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideLocatorIterator theSlide = (SlideLocatorIterator)findAncestorWithClass(this, SlideLocatorIterator.class);
			pageContext.getOut().print(theSlide.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for locator tag ");
		}
		return SKIP_BODY;
	}
}

