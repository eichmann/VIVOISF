package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterShortTitleIterator theChapter = (ChapterShortTitleIterator)findAncestorWithClass(this, ChapterShortTitleIterator.class);
			pageContext.getOut().print(theChapter.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

