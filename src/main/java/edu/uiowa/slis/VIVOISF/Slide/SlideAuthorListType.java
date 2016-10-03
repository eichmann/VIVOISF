package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideAuthorListIterator theSlideAuthorListIterator = (SlideAuthorListIterator)findAncestorWithClass(this, SlideAuthorListIterator.class);
			pageContext.getOut().print(theSlideAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for authorList tag ");
		}
		return SKIP_BODY;
	}
}

