package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterGeographicFocusIterator theChapterGeographicFocusIterator = (ChapterGeographicFocusIterator)findAncestorWithClass(this, ChapterGeographicFocusIterator.class);
			pageContext.getOut().print(theChapterGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

