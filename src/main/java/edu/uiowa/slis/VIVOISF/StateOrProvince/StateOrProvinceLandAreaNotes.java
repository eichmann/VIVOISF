package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceLandAreaNotesIterator theStateOrProvince = (StateOrProvinceLandAreaNotesIterator)findAncestorWithClass(this, StateOrProvinceLandAreaNotesIterator.class);
			pageContext.getOut().print(theStateOrProvince.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

