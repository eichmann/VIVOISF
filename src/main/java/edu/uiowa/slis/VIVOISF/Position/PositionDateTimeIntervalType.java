package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionDateTimeIntervalIterator thePositionDateTimeIntervalIterator = (PositionDateTimeIntervalIterator)findAncestorWithClass(this, PositionDateTimeIntervalIterator.class);
			pageContext.getOut().print(thePositionDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

