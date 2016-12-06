package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterHasEmailIterator theChapterHasEmailIterator = (ChapterHasEmailIterator)findAncestorWithClass(this, ChapterHasEmailIterator.class);
			pageContext.getOut().print(theChapterHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

