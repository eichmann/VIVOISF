package edu.uiowa.slis.VIVOISF.Photo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PhotoHasPhotoInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PhotoHasPhotoInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PhotoHasPhotoInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PhotoHasPhotoInverseIterator thePhotoHasPhotoInverseIterator = (PhotoHasPhotoInverseIterator)findAncestorWithClass(this, PhotoHasPhotoInverseIterator.class);
			pageContext.getOut().print(thePhotoHasPhotoInverseIterator.getHasPhotoInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Photo for hasPhoto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Photo for hasPhoto tag ");
		}
		return SKIP_BODY;
	}
}

