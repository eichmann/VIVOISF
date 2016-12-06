package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasResearchAreaIterator theSlideshowHasResearchAreaIterator = (SlideshowHasResearchAreaIterator)findAncestorWithClass(this, SlideshowHasResearchAreaIterator.class);
			pageContext.getOut().print(theSlideshowHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

