package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionContributorListIterator theBookSectionContributorListIterator = (BookSectionContributorListIterator)findAncestorWithClass(this, BookSectionContributorListIterator.class);
			pageContext.getOut().print(theBookSectionContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

