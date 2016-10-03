package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideAuthorListIterator theSlideAuthorListIterator = (SlideAuthorListIterator)findAncestorWithClass(this, SlideAuthorListIterator.class);
			pageContext.getOut().print(theSlideAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for authorList tag ");
		}
		return SKIP_BODY;
	}
}

