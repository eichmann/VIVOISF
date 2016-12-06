package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterHasMinLatitudeIterator theChapter = (ChapterHasMinLatitudeIterator)findAncestorWithClass(this, ChapterHasMinLatitudeIterator.class);
			pageContext.getOut().print(theChapter.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

