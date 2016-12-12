package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaGDPNotesIterator theArea = (AreaGDPNotesIterator)findAncestorWithClass(this, AreaGDPNotesIterator.class);
			pageContext.getOut().print(theArea.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

