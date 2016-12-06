package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionHDINotesIterator thePosition = (PositionHDINotesIterator)findAncestorWithClass(this, PositionHDINotesIterator.class);
			pageContext.getOut().print(thePosition.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

