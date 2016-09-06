package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterStatusIterator theChapterStatusIterator = (ChapterStatusIterator)findAncestorWithClass(this, ChapterStatusIterator.class);
			pageContext.getOut().print(theChapterStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for status tag ");
		}
		return SKIP_BODY;
	}
}

