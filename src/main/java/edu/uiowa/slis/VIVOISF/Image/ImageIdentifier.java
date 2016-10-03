package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageIdentifierIterator theImage = (ImageIdentifierIterator)findAncestorWithClass(this, ImageIdentifierIterator.class);
			pageContext.getOut().print(theImage.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for identifier tag ");
		}
		return SKIP_BODY;
	}
}

