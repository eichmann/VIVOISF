package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterRelatesIterator theChapterRelatesIterator = (ChapterRelatesIterator)findAncestorWithClass(this, ChapterRelatesIterator.class);
			pageContext.getOut().print(theChapterRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for relates tag ");
		}
		return SKIP_BODY;
	}
}

