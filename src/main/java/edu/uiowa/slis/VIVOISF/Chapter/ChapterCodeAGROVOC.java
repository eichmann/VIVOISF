package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCodeAGROVOCIterator theChapter = (ChapterCodeAGROVOCIterator)findAncestorWithClass(this, ChapterCodeAGROVOCIterator.class);
			pageContext.getOut().print(theChapter.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}
