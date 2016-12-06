package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHDIYearIterator thePostdocPosition = (PostdocPositionHDIYearIterator)findAncestorWithClass(this, PostdocPositionHDIYearIterator.class);
			pageContext.getOut().print(thePostdocPosition.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

