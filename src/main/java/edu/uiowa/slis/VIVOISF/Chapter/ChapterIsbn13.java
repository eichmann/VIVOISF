package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterIsbn13Iterator theChapter = (ChapterIsbn13Iterator)findAncestorWithClass(this, ChapterIsbn13Iterator.class);
			pageContext.getOut().print(theChapter.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

