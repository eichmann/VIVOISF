package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowAuthorListIterator theSlideshowAuthorListIterator = (SlideshowAuthorListIterator)findAncestorWithClass(this, SlideshowAuthorListIterator.class);
			pageContext.getOut().print(theSlideshowAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for authorList tag ");
		}
		return SKIP_BODY;
	}
}

