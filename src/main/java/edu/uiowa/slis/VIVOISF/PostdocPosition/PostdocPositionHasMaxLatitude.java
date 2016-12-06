package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasMaxLatitudeIterator thePostdocPosition = (PostdocPositionHasMaxLatitudeIterator)findAncestorWithClass(this, PostdocPositionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(thePostdocPosition.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

