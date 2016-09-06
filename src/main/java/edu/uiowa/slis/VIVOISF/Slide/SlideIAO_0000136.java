package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideIAO_0000136Iterator theSlideIAO_0000136Iterator = (SlideIAO_0000136Iterator)findAncestorWithClass(this, SlideIAO_0000136Iterator.class);
			pageContext.getOut().print(theSlideIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

