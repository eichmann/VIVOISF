package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageStatusIterator theImageStatusIterator = (ImageStatusIterator)findAncestorWithClass(this, ImageStatusIterator.class);
			pageContext.getOut().print(theImageStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for status tag ");
		}
		return SKIP_BODY;
	}
}

