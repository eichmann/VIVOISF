package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterHasPublicationVenueIterator theChapterHasPublicationVenueIterator = (ChapterHasPublicationVenueIterator)findAncestorWithClass(this, ChapterHasPublicationVenueIterator.class);
			pageContext.getOut().print(theChapterHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

