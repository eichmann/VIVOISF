package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperAgriculturalAreaNotesIterator theConferencePaper = (ConferencePaperAgriculturalAreaNotesIterator)findAncestorWithClass(this, ConferencePaperAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theConferencePaper.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

