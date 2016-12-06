package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionUrlIterator thePostdocPosition = (PostdocPositionUrlIterator)findAncestorWithClass(this, PostdocPositionUrlIterator.class);
			pageContext.getOut().print(thePostdocPosition.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for url tag ");
		}
		return SKIP_BODY;
	}
}

