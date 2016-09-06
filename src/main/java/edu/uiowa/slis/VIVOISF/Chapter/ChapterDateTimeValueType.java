package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterDateTimeValueIterator theChapterDateTimeValueIterator = (ChapterDateTimeValueIterator)findAncestorWithClass(this, ChapterDateTimeValueIterator.class);
			pageContext.getOut().print(theChapterDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

