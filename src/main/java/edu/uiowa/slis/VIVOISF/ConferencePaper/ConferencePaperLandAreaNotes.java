package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperLandAreaNotesIterator theConferencePaper = (ConferencePaperLandAreaNotesIterator)findAncestorWithClass(this, ConferencePaperLandAreaNotesIterator.class);
			pageContext.getOut().print(theConferencePaper.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

