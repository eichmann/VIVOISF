package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideSici currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideSiciIterator theSlide = (SlideSiciIterator)findAncestorWithClass(this, SlideSiciIterator.class);
			pageContext.getOut().print(theSlide.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for sici tag ");
		}
		return SKIP_BODY;
	}
}

