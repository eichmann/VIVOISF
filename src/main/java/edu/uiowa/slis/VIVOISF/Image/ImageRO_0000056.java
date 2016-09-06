package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageRO_0000056Iterator theImageRO_0000056Iterator = (ImageRO_0000056Iterator)findAncestorWithClass(this, ImageRO_0000056Iterator.class);
			pageContext.getOut().print(theImageRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

