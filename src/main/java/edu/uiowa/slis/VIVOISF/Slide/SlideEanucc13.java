package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideEanucc13Iterator theSlide = (SlideEanucc13Iterator)findAncestorWithClass(this, SlideEanucc13Iterator.class);
			pageContext.getOut().print(theSlide.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

