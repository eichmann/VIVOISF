package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionDateTimeIntervalIterator thePostdocPositionDateTimeIntervalIterator = (PostdocPositionDateTimeIntervalIterator)findAncestorWithClass(this, PostdocPositionDateTimeIntervalIterator.class);
			pageContext.getOut().print(thePostdocPositionDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

