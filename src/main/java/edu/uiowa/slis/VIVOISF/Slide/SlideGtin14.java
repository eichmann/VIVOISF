package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideGtin14Iterator theSlide = (SlideGtin14Iterator)findAncestorWithClass(this, SlideGtin14Iterator.class);
			pageContext.getOut().print(theSlide.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}
