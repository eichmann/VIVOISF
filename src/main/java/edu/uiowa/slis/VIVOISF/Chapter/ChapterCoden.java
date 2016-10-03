package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCodenIterator theChapter = (ChapterCodenIterator)findAncestorWithClass(this, ChapterCodenIterator.class);
			pageContext.getOut().print(theChapter.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for coden tag ");
		}
		return SKIP_BODY;
	}
}

