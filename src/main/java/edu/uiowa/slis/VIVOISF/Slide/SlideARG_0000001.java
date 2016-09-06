package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideARG_0000001Iterator theSlide = (SlideARG_0000001Iterator)findAncestorWithClass(this, SlideARG_0000001Iterator.class);
			pageContext.getOut().print(theSlide.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

