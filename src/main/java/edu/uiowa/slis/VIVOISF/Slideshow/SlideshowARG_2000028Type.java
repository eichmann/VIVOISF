package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowARG_2000028Iterator theSlideshowARG_2000028Iterator = (SlideshowARG_2000028Iterator)findAncestorWithClass(this, SlideshowARG_2000028Iterator.class);
			pageContext.getOut().print(theSlideshowARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

