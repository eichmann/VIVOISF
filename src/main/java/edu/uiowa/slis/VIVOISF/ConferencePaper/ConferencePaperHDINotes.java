package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHDINotesIterator theConferencePaper = (ConferencePaperHDINotesIterator)findAncestorWithClass(this, ConferencePaperHDINotesIterator.class);
			pageContext.getOut().print(theConferencePaper.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

