package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterGDPNotesIterator theChapter = (ChapterGDPNotesIterator)findAncestorWithClass(this, ChapterGDPNotesIterator.class);
			pageContext.getOut().print(theChapter.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

