package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionDateTimeIntervalIterator thePrimaryPositionDateTimeIntervalIterator = (PrimaryPositionDateTimeIntervalIterator)findAncestorWithClass(this, PrimaryPositionDateTimeIntervalIterator.class);
			pageContext.getOut().print(thePrimaryPositionDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

