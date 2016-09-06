package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageStatusIterator theImageStatusIterator = (ImageStatusIterator)findAncestorWithClass(this, ImageStatusIterator.class);
			pageContext.getOut().print(theImageStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for status tag ");
		}
		return SKIP_BODY;
	}
}

