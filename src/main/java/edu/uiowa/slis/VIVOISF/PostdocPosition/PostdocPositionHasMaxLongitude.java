package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasMaxLongitudeIterator thePostdocPosition = (PostdocPositionHasMaxLongitudeIterator)findAncestorWithClass(this, PostdocPositionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(thePostdocPosition.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

