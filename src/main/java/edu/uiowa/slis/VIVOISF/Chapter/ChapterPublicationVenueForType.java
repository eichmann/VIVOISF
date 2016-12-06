package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterPublicationVenueForIterator theChapterPublicationVenueForIterator = (ChapterPublicationVenueForIterator)findAncestorWithClass(this, ChapterPublicationVenueForIterator.class);
			pageContext.getOut().print(theChapterPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

