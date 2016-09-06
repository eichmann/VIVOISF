package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterHasSubjectAreaIterator theChapterHasSubjectAreaIterator = (ChapterHasSubjectAreaIterator)findAncestorWithClass(this, ChapterHasSubjectAreaIterator.class);
			pageContext.getOut().print(theChapterHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

