package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterContributorListIterator theChapterContributorListIterator = (ChapterContributorListIterator)findAncestorWithClass(this, ChapterContributorListIterator.class);
			pageContext.getOut().print(theChapterContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

