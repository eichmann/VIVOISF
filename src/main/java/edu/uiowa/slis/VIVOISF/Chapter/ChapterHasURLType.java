package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterHasURLIterator theChapterHasURLIterator = (ChapterHasURLIterator)findAncestorWithClass(this, ChapterHasURLIterator.class);
			pageContext.getOut().print(theChapterHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

