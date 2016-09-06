package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterCitedByIterator theChapterCitedByIterator = (ChapterCitedByIterator)findAncestorWithClass(this, ChapterCitedByIterator.class);
			pageContext.getOut().print(theChapterCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

