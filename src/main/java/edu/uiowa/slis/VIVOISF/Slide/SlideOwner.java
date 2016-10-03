package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideOwnerIterator theSlideOwnerIterator = (SlideOwnerIterator)findAncestorWithClass(this, SlideOwnerIterator.class);
			pageContext.getOut().print(theSlideOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for owner tag ");
		}
		return SKIP_BODY;
	}
}
