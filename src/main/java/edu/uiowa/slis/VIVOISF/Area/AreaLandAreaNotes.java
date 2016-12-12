package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaLandAreaNotesIterator theArea = (AreaLandAreaNotesIterator)findAncestorWithClass(this, AreaLandAreaNotesIterator.class);
			pageContext.getOut().print(theArea.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

