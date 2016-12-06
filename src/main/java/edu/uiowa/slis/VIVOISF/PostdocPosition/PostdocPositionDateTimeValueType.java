package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionDateTimeValueIterator thePostdocPositionDateTimeValueIterator = (PostdocPositionDateTimeValueIterator)findAncestorWithClass(this, PostdocPositionDateTimeValueIterator.class);
			pageContext.getOut().print(thePostdocPositionDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

