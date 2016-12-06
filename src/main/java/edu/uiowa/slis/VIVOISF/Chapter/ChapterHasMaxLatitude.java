package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterHasMaxLatitudeIterator theChapter = (ChapterHasMaxLatitudeIterator)findAncestorWithClass(this, ChapterHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theChapter.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

