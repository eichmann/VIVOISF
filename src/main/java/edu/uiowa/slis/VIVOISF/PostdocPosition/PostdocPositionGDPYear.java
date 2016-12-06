package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionGDPYearIterator thePostdocPosition = (PostdocPositionGDPYearIterator)findAncestorWithClass(this, PostdocPositionGDPYearIterator.class);
			pageContext.getOut().print(thePostdocPosition.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

