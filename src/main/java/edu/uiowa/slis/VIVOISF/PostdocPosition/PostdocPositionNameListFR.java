package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameListFRIterator thePostdocPosition = (PostdocPositionNameListFRIterator)findAncestorWithClass(this, PostdocPositionNameListFRIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

