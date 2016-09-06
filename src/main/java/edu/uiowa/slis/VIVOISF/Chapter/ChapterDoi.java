package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterDoiIterator theChapter = (ChapterDoiIterator)findAncestorWithClass(this, ChapterDoiIterator.class);
			pageContext.getOut().print(theChapter.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for doi tag ");
		}
		return SKIP_BODY;
	}
}

