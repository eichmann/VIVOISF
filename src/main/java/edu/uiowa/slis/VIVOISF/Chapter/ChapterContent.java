package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterContentIterator theChapter = (ChapterContentIterator)findAncestorWithClass(this, ChapterContentIterator.class);
			pageContext.getOut().print(theChapter.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for content tag ");
		}
		return SKIP_BODY;
	}
}

