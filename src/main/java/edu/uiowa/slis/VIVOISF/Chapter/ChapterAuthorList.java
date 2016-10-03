package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterAuthorListIterator theChapterAuthorListIterator = (ChapterAuthorListIterator)findAncestorWithClass(this, ChapterAuthorListIterator.class);
			pageContext.getOut().print(theChapterAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for authorList tag ");
		}
		return SKIP_BODY;
	}
}

