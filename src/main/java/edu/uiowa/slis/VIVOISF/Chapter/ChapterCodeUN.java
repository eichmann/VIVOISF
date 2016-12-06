package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCodeUNIterator theChapter = (ChapterCodeUNIterator)findAncestorWithClass(this, ChapterCodeUNIterator.class);
			pageContext.getOut().print(theChapter.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

