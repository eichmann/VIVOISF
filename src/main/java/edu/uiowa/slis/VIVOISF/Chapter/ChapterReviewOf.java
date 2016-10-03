package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterReviewOfIterator theChapterReviewOfIterator = (ChapterReviewOfIterator)findAncestorWithClass(this, ChapterReviewOfIterator.class);
			pageContext.getOut().print(theChapterReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

