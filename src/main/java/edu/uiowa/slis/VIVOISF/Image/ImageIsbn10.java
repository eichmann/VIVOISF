package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageIsbn10Iterator theImage = (ImageIsbn10Iterator)findAncestorWithClass(this, ImageIsbn10Iterator.class);
			pageContext.getOut().print(theImage.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

