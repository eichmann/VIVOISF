package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterLandAreaNotesIterator theChapter = (ChapterLandAreaNotesIterator)findAncestorWithClass(this, ChapterLandAreaNotesIterator.class);
			pageContext.getOut().print(theChapter.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

