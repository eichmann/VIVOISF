package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideUpcIterator theSlide = (SlideUpcIterator)findAncestorWithClass(this, SlideUpcIterator.class);
			pageContext.getOut().print(theSlide.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for upc tag ");
		}
		return SKIP_BODY;
	}
}

