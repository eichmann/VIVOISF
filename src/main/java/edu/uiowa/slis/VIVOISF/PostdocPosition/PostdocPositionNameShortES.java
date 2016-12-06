package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameShortESIterator thePostdocPosition = (PostdocPositionNameShortESIterator)findAncestorWithClass(this, PostdocPositionNameShortESIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

