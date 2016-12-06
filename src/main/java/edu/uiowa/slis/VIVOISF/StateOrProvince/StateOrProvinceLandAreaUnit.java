package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceLandAreaUnitIterator theStateOrProvince = (StateOrProvinceLandAreaUnitIterator)findAncestorWithClass(this, StateOrProvinceLandAreaUnitIterator.class);
			pageContext.getOut().print(theStateOrProvince.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

