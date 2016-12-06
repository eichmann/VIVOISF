package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCountryAreaNotesIterator theChapter = (ChapterCountryAreaNotesIterator)findAncestorWithClass(this, ChapterCountryAreaNotesIterator.class);
			pageContext.getOut().print(theChapter.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

