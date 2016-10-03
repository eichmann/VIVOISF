package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideOclcnumIterator theSlide = (SlideOclcnumIterator)findAncestorWithClass(this, SlideOclcnumIterator.class);
			pageContext.getOut().print(theSlide.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

