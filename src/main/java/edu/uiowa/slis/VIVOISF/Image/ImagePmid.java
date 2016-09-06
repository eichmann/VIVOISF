package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImagePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImagePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ImagePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImagePmidIterator theImage = (ImagePmidIterator)findAncestorWithClass(this, ImagePmidIterator.class);
			pageContext.getOut().print(theImage.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for pmid tag ");
		}
		return SKIP_BODY;
	}
}

