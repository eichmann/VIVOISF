package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceDateTimeIntervalIterator theStateOrProvinceDateTimeIntervalIterator = (StateOrProvinceDateTimeIntervalIterator)findAncestorWithClass(this, StateOrProvinceDateTimeIntervalIterator.class);
			pageContext.getOut().print(theStateOrProvinceDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}
