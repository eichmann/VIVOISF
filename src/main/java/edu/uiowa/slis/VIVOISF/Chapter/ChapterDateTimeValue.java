package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterDateTimeValueIterator theChapterDateTimeValueIterator = (ChapterDateTimeValueIterator)findAncestorWithClass(this, ChapterDateTimeValueIterator.class);
			pageContext.getOut().print(theChapterDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

