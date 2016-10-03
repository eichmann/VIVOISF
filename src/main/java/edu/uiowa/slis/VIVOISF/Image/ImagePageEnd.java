package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImagePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImagePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ImagePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImagePageEndIterator theImage = (ImagePageEndIterator)findAncestorWithClass(this, ImagePageEndIterator.class);
			pageContext.getOut().print(theImage.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

