package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameShortARIterator thePostdocPosition = (PostdocPositionNameShortARIterator)findAncestorWithClass(this, PostdocPositionNameShortARIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

