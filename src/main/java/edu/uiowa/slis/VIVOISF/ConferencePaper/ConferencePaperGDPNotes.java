package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperGDPNotesIterator theConferencePaper = (ConferencePaperGDPNotesIterator)findAncestorWithClass(this, ConferencePaperGDPNotesIterator.class);
			pageContext.getOut().print(theConferencePaper.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

