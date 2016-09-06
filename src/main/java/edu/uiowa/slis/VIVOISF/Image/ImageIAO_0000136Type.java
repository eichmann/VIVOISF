package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageIAO_0000136Iterator theImageIAO_0000136Iterator = (ImageIAO_0000136Iterator)findAncestorWithClass(this, ImageIAO_0000136Iterator.class);
			pageContext.getOut().print(theImageIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

