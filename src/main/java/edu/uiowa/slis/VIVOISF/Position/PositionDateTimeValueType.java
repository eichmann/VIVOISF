package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionDateTimeValueIterator thePositionDateTimeValueIterator = (PositionDateTimeValueIterator)findAncestorWithClass(this, PositionDateTimeValueIterator.class);
			pageContext.getOut().print(thePositionDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

