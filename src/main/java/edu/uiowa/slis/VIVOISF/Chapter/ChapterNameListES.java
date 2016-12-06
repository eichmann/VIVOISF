package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameListESIterator theChapter = (ChapterNameListESIterator)findAncestorWithClass(this, ChapterNameListESIterator.class);
			pageContext.getOut().print(theChapter.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

