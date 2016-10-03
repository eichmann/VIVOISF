package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImagePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImagePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ImagePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImagePageStartIterator theImage = (ImagePageStartIterator)findAncestorWithClass(this, ImagePageStartIterator.class);
			pageContext.getOut().print(theImage.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

