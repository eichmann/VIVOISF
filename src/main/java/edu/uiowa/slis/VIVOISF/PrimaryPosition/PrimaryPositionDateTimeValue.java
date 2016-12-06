package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionDateTimeValueIterator thePrimaryPositionDateTimeValueIterator = (PrimaryPositionDateTimeValueIterator)findAncestorWithClass(this, PrimaryPositionDateTimeValueIterator.class);
			pageContext.getOut().print(thePrimaryPositionDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

