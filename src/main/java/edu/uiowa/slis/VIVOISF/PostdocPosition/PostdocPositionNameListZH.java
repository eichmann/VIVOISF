package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameListZHIterator thePostdocPosition = (PostdocPositionNameListZHIterator)findAncestorWithClass(this, PostdocPositionNameListZHIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

