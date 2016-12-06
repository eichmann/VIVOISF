package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHDINotesIterator theConferencePoster = (ConferencePosterHDINotesIterator)findAncestorWithClass(this, ConferencePosterHDINotesIterator.class);
			pageContext.getOut().print(theConferencePoster.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

