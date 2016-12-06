package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionDateTimeValueIterator thePrimaryPositionDateTimeValueIterator = (PrimaryPositionDateTimeValueIterator)findAncestorWithClass(this, PrimaryPositionDateTimeValueIterator.class);
			pageContext.getOut().print(thePrimaryPositionDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

