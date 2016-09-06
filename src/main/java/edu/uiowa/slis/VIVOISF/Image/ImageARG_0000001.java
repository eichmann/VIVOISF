package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageARG_0000001Iterator theImage = (ImageARG_0000001Iterator)findAncestorWithClass(this, ImageARG_0000001Iterator.class);
			pageContext.getOut().print(theImage.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

