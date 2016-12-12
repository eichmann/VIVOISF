package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaHDINotesIterator theArea = (AreaHDINotesIterator)findAncestorWithClass(this, AreaHDINotesIterator.class);
			pageContext.getOut().print(theArea.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

