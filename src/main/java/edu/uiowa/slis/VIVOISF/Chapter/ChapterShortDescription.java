package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterShortDescriptionIterator theChapter = (ChapterShortDescriptionIterator)findAncestorWithClass(this, ChapterShortDescriptionIterator.class);
			pageContext.getOut().print(theChapter.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

