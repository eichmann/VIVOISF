package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterFreetextKeywordIterator theChapter = (ChapterFreetextKeywordIterator)findAncestorWithClass(this, ChapterFreetextKeywordIterator.class);
			pageContext.getOut().print(theChapter.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

