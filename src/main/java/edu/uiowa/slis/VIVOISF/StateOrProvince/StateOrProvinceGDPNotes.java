package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceGDPNotesIterator theStateOrProvince = (StateOrProvinceGDPNotesIterator)findAncestorWithClass(this, StateOrProvinceGDPNotesIterator.class);
			pageContext.getOut().print(theStateOrProvince.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

