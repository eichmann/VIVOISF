package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHDINotesIterator theStateOrProvince = (StateOrProvinceHDINotesIterator)findAncestorWithClass(this, StateOrProvinceHDINotesIterator.class);
			pageContext.getOut().print(theStateOrProvince.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

