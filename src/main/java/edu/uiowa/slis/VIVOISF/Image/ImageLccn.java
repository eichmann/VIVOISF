package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageLccnIterator theImage = (ImageLccnIterator)findAncestorWithClass(this, ImageLccnIterator.class);
			pageContext.getOut().print(theImage.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for lccn tag ");
		}
		return SKIP_BODY;
	}
}

