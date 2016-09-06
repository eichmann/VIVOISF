package edu.uiowa.slis.VIVOISF.Photo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PhotoUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PhotoUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(PhotoUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PhotoUrlIterator thePhoto = (PhotoUrlIterator)findAncestorWithClass(this, PhotoUrlIterator.class);
			pageContext.getOut().print(thePhoto.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Photo for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Photo for url tag ");
		}
		return SKIP_BODY;
	}
}

