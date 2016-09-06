package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterTranslationOfIterator theChapterTranslationOfIterator = (ChapterTranslationOfIterator)findAncestorWithClass(this, ChapterTranslationOfIterator.class);
			pageContext.getOut().print(theChapterTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

