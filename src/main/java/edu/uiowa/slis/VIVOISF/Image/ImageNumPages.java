package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageNumPagesIterator theImage = (ImageNumPagesIterator)findAncestorWithClass(this, ImageNumPagesIterator.class);
			pageContext.getOut().print(theImage.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for numPages tag ");
		}
		return SKIP_BODY;
	}
}

