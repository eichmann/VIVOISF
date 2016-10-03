package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(BookContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookContributorListIterator theBookContributorListIterator = (BookContributorListIterator)findAncestorWithClass(this, BookContributorListIterator.class);
			pageContext.getOut().print(theBookContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

