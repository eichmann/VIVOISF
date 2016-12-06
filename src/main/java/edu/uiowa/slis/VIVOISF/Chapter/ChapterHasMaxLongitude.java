package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterHasMaxLongitudeIterator theChapter = (ChapterHasMaxLongitudeIterator)findAncestorWithClass(this, ChapterHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theChapter.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

