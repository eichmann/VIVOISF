package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionLandAreaYearIterator thePostdocPosition = (PostdocPositionLandAreaYearIterator)findAncestorWithClass(this, PostdocPositionLandAreaYearIterator.class);
			pageContext.getOut().print(thePostdocPosition.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

