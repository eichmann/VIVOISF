package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameShortZHIterator thePostdocPosition = (PostdocPositionNameShortZHIterator)findAncestorWithClass(this, PostdocPositionNameShortZHIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

