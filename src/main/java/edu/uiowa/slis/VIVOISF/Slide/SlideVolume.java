package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideVolumeIterator theSlide = (SlideVolumeIterator)findAncestorWithClass(this, SlideVolumeIterator.class);
			pageContext.getOut().print(theSlide.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for volume tag ");
		}
		return SKIP_BODY;
	}
}

