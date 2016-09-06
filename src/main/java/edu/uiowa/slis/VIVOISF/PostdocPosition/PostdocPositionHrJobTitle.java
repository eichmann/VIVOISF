package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHrJobTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHrJobTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHrJobTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHrJobTitleIterator thePostdocPosition = (PostdocPositionHrJobTitleIterator)findAncestorWithClass(this, PostdocPositionHrJobTitleIterator.class);
			pageContext.getOut().print(thePostdocPosition.getHrJobTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hrJobTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hrJobTitle tag ");
		}
		return SKIP_BODY;
	}
}

