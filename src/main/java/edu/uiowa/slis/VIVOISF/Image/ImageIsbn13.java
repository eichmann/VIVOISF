package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageIsbn13Iterator theImage = (ImageIsbn13Iterator)findAncestorWithClass(this, ImageIsbn13Iterator.class);
			pageContext.getOut().print(theImage.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

