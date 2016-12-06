package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterAgriculturalAreaNotesIterator theConferencePoster = (ConferencePosterAgriculturalAreaNotesIterator)findAncestorWithClass(this, ConferencePosterAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theConferencePoster.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

