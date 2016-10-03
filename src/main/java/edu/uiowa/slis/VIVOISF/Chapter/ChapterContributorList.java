package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterContributorListIterator theChapterContributorListIterator = (ChapterContributorListIterator)findAncestorWithClass(this, ChapterContributorListIterator.class);
			pageContext.getOut().print(theChapterContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

