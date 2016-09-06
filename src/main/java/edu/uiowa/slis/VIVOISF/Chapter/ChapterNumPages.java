package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNumPagesIterator theChapter = (ChapterNumPagesIterator)findAncestorWithClass(this, ChapterNumPagesIterator.class);
			pageContext.getOut().print(theChapter.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for numPages tag ");
		}
		return SKIP_BODY;
	}
}

