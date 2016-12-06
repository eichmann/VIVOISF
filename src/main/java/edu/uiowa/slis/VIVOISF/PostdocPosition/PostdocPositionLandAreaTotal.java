package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionLandAreaTotalIterator thePostdocPosition = (PostdocPositionLandAreaTotalIterator)findAncestorWithClass(this, PostdocPositionLandAreaTotalIterator.class);
			pageContext.getOut().print(thePostdocPosition.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

