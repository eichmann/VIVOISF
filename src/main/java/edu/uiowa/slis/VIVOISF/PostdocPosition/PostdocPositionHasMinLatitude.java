package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasMinLatitudeIterator thePostdocPosition = (PostdocPositionHasMinLatitudeIterator)findAncestorWithClass(this, PostdocPositionHasMinLatitudeIterator.class);
			pageContext.getOut().print(thePostdocPosition.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

