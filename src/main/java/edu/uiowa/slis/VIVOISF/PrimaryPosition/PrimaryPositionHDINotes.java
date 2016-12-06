package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHDINotesIterator thePrimaryPosition = (PrimaryPositionHDINotesIterator)findAncestorWithClass(this, PrimaryPositionHDINotesIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

