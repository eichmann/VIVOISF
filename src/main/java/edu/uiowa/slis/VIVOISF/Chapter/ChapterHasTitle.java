package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterHasTitleIterator theChapterHasTitleIterator = (ChapterHasTitleIterator)findAncestorWithClass(this, ChapterHasTitleIterator.class);
			pageContext.getOut().print(theChapterHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

