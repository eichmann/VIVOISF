package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceDateTimeValueIterator theStateOrProvinceDateTimeValueIterator = (StateOrProvinceDateTimeValueIterator)findAncestorWithClass(this, StateOrProvinceDateTimeValueIterator.class);
			pageContext.getOut().print(theStateOrProvinceDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}
