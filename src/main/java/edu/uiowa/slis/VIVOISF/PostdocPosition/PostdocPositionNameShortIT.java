package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameShortITIterator thePostdocPosition = (PostdocPositionNameShortITIterator)findAncestorWithClass(this, PostdocPositionNameShortITIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

