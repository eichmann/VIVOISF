package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterChapter extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterChapter currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterChapter.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterChapterIterator theChapter = (ChapterChapterIterator)findAncestorWithClass(this, ChapterChapterIterator.class);
			pageContext.getOut().print(theChapter.getChapter());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for chapter tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for chapter tag ");
		}
		return SKIP_BODY;
	}
}

