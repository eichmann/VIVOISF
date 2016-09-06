package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceDateTimeIntervalIterator theConferenceDateTimeIntervalIterator = (ConferenceDateTimeIntervalIterator)findAncestorWithClass(this, ConferenceDateTimeIntervalIterator.class);
			pageContext.getOut().print(theConferenceDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

