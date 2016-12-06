package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameListITIterator theChapter = (ChapterNameListITIterator)findAncestorWithClass(this, ChapterNameListITIterator.class);
			pageContext.getOut().print(theChapter.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

