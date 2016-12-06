package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCodeFAOSTATIterator theChapter = (ChapterCodeFAOSTATIterator)findAncestorWithClass(this, ChapterCodeFAOSTATIterator.class);
			pageContext.getOut().print(theChapter.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

