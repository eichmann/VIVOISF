package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterHasTranslationIterator theChapterHasTranslationIterator = (ChapterHasTranslationIterator)findAncestorWithClass(this, ChapterHasTranslationIterator.class);
			pageContext.getOut().print(theChapterHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

