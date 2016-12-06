package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameShortRUIterator thePostdocPosition = (PostdocPositionNameShortRUIterator)findAncestorWithClass(this, PostdocPositionNameShortRUIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

