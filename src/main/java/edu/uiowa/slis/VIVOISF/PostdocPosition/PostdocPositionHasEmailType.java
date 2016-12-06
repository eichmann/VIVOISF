package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasEmailIterator thePostdocPositionHasEmailIterator = (PostdocPositionHasEmailIterator)findAncestorWithClass(this, PostdocPositionHasEmailIterator.class);
			pageContext.getOut().print(thePostdocPositionHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

