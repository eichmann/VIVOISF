package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageERO_0000045Iterator theImage = (ImageERO_0000045Iterator)findAncestorWithClass(this, ImageERO_0000045Iterator.class);
			pageContext.getOut().print(theImage.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

