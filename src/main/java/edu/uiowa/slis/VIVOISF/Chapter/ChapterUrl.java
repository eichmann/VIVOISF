package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterUrlIterator theChapter = (ChapterUrlIterator)findAncestorWithClass(this, ChapterUrlIterator.class);
			pageContext.getOut().print(theChapter.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for url tag ");
		}
		return SKIP_BODY;
	}
}

