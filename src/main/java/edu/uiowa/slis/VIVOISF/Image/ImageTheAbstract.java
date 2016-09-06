package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageTheAbstractIterator theImage = (ImageTheAbstractIterator)findAncestorWithClass(this, ImageTheAbstractIterator.class);
			pageContext.getOut().print(theImage.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

