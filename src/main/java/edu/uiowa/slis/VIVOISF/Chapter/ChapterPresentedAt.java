package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterPresentedAtIterator theChapterPresentedAtIterator = (ChapterPresentedAtIterator)findAncestorWithClass(this, ChapterPresentedAtIterator.class);
			pageContext.getOut().print(theChapterPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

