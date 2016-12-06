package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterHasMinLongitudeIterator theChapter = (ChapterHasMinLongitudeIterator)findAncestorWithClass(this, ChapterHasMinLongitudeIterator.class);
			pageContext.getOut().print(theChapter.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

