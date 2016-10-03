package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNumberIterator theChapter = (ChapterNumberIterator)findAncestorWithClass(this, ChapterNumberIterator.class);
			pageContext.getOut().print(theChapter.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for number tag ");
		}
		return SKIP_BODY;
	}
}

