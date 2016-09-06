package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionRelatesIterator thePostdocPositionRelatesIterator = (PostdocPositionRelatesIterator)findAncestorWithClass(this, PostdocPositionRelatesIterator.class);
			pageContext.getOut().print(thePostdocPositionRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for relates tag ");
		}
		return SKIP_BODY;
	}
}

