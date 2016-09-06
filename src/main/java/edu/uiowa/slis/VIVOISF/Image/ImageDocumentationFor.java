package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageDocumentationForIterator theImageDocumentationForIterator = (ImageDocumentationForIterator)findAncestorWithClass(this, ImageDocumentationForIterator.class);
			pageContext.getOut().print(theImageDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

