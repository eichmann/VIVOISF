package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasNameIterator thePostdocPositionHasNameIterator = (PostdocPositionHasNameIterator)findAncestorWithClass(this, PostdocPositionHasNameIterator.class);
			pageContext.getOut().print(thePostdocPositionHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasName tag ");
		}
		return SKIP_BODY;
	}
}

