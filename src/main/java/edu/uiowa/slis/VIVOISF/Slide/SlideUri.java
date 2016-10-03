package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideUri currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideUriIterator theSlide = (SlideUriIterator)findAncestorWithClass(this, SlideUriIterator.class);
			pageContext.getOut().print(theSlide.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for uri tag ");
		}
		return SKIP_BODY;
	}
}

