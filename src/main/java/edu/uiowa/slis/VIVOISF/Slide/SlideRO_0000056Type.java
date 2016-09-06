package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideRO_0000056Iterator theSlideRO_0000056Iterator = (SlideRO_0000056Iterator)findAncestorWithClass(this, SlideRO_0000056Iterator.class);
			pageContext.getOut().print(theSlideRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

