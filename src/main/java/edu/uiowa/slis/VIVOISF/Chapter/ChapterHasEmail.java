package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterHasEmailIterator theChapterHasEmailIterator = (ChapterHasEmailIterator)findAncestorWithClass(this, ChapterHasEmailIterator.class);
			pageContext.getOut().print(theChapterHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

