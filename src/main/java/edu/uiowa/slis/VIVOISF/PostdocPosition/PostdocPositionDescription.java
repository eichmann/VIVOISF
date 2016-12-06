package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionDescriptionIterator thePostdocPosition = (PostdocPositionDescriptionIterator)findAncestorWithClass(this, PostdocPositionDescriptionIterator.class);
			pageContext.getOut().print(thePostdocPosition.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for description tag ");
		}
		return SKIP_BODY;
	}
}

