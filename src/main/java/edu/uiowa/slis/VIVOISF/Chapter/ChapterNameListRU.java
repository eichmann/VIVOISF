package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameListRUIterator theChapter = (ChapterNameListRUIterator)findAncestorWithClass(this, ChapterNameListRUIterator.class);
			pageContext.getOut().print(theChapter.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

