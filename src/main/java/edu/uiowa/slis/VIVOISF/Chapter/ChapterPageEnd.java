package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterPageEndIterator theChapter = (ChapterPageEndIterator)findAncestorWithClass(this, ChapterPageEndIterator.class);
			pageContext.getOut().print(theChapter.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

