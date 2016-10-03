package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterSectionIterator theChapter = (ChapterSectionIterator)findAncestorWithClass(this, ChapterSectionIterator.class);
			pageContext.getOut().print(theChapter.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for section tag ");
		}
		return SKIP_BODY;
	}
}

