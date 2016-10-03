package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterPagesIterator theChapter = (ChapterPagesIterator)findAncestorWithClass(this, ChapterPagesIterator.class);
			pageContext.getOut().print(theChapter.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for pages tag ");
		}
		return SKIP_BODY;
	}
}

