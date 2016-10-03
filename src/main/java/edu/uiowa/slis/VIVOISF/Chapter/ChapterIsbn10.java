package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterIsbn10Iterator theChapter = (ChapterIsbn10Iterator)findAncestorWithClass(this, ChapterIsbn10Iterator.class);
			pageContext.getOut().print(theChapter.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

