package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterTranslatorIterator theChapterTranslatorIterator = (ChapterTranslatorIterator)findAncestorWithClass(this, ChapterTranslatorIterator.class);
			pageContext.getOut().print(theChapterTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for translator tag ");
		}
		return SKIP_BODY;
	}
}

