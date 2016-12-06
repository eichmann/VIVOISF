package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCodeFAOTERMIterator theChapter = (ChapterCodeFAOTERMIterator)findAncestorWithClass(this, ChapterCodeFAOTERMIterator.class);
			pageContext.getOut().print(theChapter.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

