package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameListARIterator thePostdocPosition = (PostdocPositionNameListARIterator)findAncestorWithClass(this, PostdocPositionNameListARIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

