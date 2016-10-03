package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookContributorListIterator theBookContributorListIterator = (BookContributorListIterator)findAncestorWithClass(this, BookContributorListIterator.class);
			pageContext.getOut().print(theBookContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

