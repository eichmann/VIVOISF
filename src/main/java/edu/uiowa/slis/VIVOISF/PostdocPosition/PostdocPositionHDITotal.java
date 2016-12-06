package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHDITotalIterator thePostdocPosition = (PostdocPositionHDITotalIterator)findAncestorWithClass(this, PostdocPositionHDITotalIterator.class);
			pageContext.getOut().print(thePostdocPosition.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

