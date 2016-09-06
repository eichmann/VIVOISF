package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterStatusIterator theChapterStatusIterator = (ChapterStatusIterator)findAncestorWithClass(this, ChapterStatusIterator.class);
			pageContext.getOut().print(theChapterStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for status tag ");
		}
		return SKIP_BODY;
	}
}

