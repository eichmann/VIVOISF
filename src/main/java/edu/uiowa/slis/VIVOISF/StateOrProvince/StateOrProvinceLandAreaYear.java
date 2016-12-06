package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceLandAreaYearIterator theStateOrProvince = (StateOrProvinceLandAreaYearIterator)findAncestorWithClass(this, StateOrProvinceLandAreaYearIterator.class);
			pageContext.getOut().print(theStateOrProvince.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

