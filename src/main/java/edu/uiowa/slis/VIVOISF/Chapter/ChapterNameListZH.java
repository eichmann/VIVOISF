package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameListZHIterator theChapter = (ChapterNameListZHIterator)findAncestorWithClass(this, ChapterNameListZHIterator.class);
			pageContext.getOut().print(theChapter.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

