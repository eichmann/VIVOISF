package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterRank currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterRankIterator theChapter = (ChapterRankIterator)findAncestorWithClass(this, ChapterRankIterator.class);
			pageContext.getOut().print(theChapter.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for rank tag ");
		}
		return SKIP_BODY;
	}
}

