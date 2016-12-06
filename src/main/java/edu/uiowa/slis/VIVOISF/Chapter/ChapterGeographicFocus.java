package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterGeographicFocusIterator theChapterGeographicFocusIterator = (ChapterGeographicFocusIterator)findAncestorWithClass(this, ChapterGeographicFocusIterator.class);
			pageContext.getOut().print(theChapterGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

