package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceLandAreaTotalIterator theStateOrProvince = (StateOrProvinceLandAreaTotalIterator)findAncestorWithClass(this, StateOrProvinceLandAreaTotalIterator.class);
			pageContext.getOut().print(theStateOrProvince.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

