package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameShortRUIterator theChapter = (ChapterNameShortRUIterator)findAncestorWithClass(this, ChapterNameShortRUIterator.class);
			pageContext.getOut().print(theChapter.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

