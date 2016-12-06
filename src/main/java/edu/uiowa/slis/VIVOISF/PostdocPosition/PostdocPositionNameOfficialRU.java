package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameOfficialRUIterator thePostdocPosition = (PostdocPositionNameOfficialRUIterator)findAncestorWithClass(this, PostdocPositionNameOfficialRUIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

