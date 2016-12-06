package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasURLIterator thePostdocPositionHasURLIterator = (PostdocPositionHasURLIterator)findAncestorWithClass(this, PostdocPositionHasURLIterator.class);
			pageContext.getOut().print(thePostdocPositionHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

