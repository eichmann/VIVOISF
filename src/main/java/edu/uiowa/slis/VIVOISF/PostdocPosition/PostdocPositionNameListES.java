package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameListESIterator thePostdocPosition = (PostdocPositionNameListESIterator)findAncestorWithClass(this, PostdocPositionNameListESIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

