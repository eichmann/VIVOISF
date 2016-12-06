package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterHDINotesIterator theChapter = (ChapterHDINotesIterator)findAncestorWithClass(this, ChapterHDINotesIterator.class);
			pageContext.getOut().print(theChapter.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

