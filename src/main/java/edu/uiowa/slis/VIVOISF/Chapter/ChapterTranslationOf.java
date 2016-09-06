package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterTranslationOfIterator theChapterTranslationOfIterator = (ChapterTranslationOfIterator)findAncestorWithClass(this, ChapterTranslationOfIterator.class);
			pageContext.getOut().print(theChapterTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

