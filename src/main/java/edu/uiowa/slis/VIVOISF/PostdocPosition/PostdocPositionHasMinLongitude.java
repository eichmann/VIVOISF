package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasMinLongitudeIterator thePostdocPosition = (PostdocPositionHasMinLongitudeIterator)findAncestorWithClass(this, PostdocPositionHasMinLongitudeIterator.class);
			pageContext.getOut().print(thePostdocPosition.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

