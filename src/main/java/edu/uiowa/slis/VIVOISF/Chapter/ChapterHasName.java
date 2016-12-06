package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterHasNameIterator theChapterHasNameIterator = (ChapterHasNameIterator)findAncestorWithClass(this, ChapterHasNameIterator.class);
			pageContext.getOut().print(theChapterHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasName tag ");
		}
		return SKIP_BODY;
	}
}

