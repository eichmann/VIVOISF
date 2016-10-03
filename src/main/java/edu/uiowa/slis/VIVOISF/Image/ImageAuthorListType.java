package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageAuthorListIterator theImageAuthorListIterator = (ImageAuthorListIterator)findAncestorWithClass(this, ImageAuthorListIterator.class);
			pageContext.getOut().print(theImageAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for authorList tag ");
		}
		return SKIP_BODY;
	}
}

