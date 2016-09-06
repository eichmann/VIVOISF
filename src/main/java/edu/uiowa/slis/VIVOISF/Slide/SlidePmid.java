package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlidePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlidePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(SlidePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlidePmidIterator theSlide = (SlidePmidIterator)findAncestorWithClass(this, SlidePmidIterator.class);
			pageContext.getOut().print(theSlide.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for pmid tag ");
		}
		return SKIP_BODY;
	}
}

