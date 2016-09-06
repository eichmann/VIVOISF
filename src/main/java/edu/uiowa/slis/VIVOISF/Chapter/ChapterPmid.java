package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterPmidIterator theChapter = (ChapterPmidIterator)findAncestorWithClass(this, ChapterPmidIterator.class);
			pageContext.getOut().print(theChapter.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for pmid tag ");
		}
		return SKIP_BODY;
	}
}

