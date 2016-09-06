package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageDoiIterator theImage = (ImageDoiIterator)findAncestorWithClass(this, ImageDoiIterator.class);
			pageContext.getOut().print(theImage.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for doi tag ");
		}
		return SKIP_BODY;
	}
}

