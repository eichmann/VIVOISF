package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameListITIterator thePostdocPosition = (PostdocPositionNameListITIterator)findAncestorWithClass(this, PostdocPositionNameListITIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

