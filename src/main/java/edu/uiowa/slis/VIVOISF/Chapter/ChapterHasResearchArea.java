package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterHasResearchAreaIterator theChapterHasResearchAreaIterator = (ChapterHasResearchAreaIterator)findAncestorWithClass(this, ChapterHasResearchAreaIterator.class);
			pageContext.getOut().print(theChapterHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

