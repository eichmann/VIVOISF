package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterPublicationVenueForIterator theChapterPublicationVenueForIterator = (ChapterPublicationVenueForIterator)findAncestorWithClass(this, ChapterPublicationVenueForIterator.class);
			pageContext.getOut().print(theChapterPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

