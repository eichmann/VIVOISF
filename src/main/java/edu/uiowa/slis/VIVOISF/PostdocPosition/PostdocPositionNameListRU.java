package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameListRUIterator thePostdocPosition = (PostdocPositionNameListRUIterator)findAncestorWithClass(this, PostdocPositionNameListRUIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

