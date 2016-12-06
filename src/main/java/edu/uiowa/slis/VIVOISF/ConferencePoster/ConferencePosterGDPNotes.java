package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterGDPNotesIterator theConferencePoster = (ConferencePosterGDPNotesIterator)findAncestorWithClass(this, ConferencePosterGDPNotesIterator.class);
			pageContext.getOut().print(theConferencePoster.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

