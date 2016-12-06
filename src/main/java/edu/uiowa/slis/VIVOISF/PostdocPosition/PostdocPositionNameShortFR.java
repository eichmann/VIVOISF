package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameShortFRIterator thePostdocPosition = (PostdocPositionNameShortFRIterator)findAncestorWithClass(this, PostdocPositionNameShortFRIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

