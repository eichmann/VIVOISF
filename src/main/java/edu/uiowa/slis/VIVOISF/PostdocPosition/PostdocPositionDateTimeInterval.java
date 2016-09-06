package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionDateTimeIntervalIterator thePostdocPositionDateTimeIntervalIterator = (PostdocPositionDateTimeIntervalIterator)findAncestorWithClass(this, PostdocPositionDateTimeIntervalIterator.class);
			pageContext.getOut().print(thePostdocPositionDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

