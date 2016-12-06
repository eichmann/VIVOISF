package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookHasResearchAreaIterator theBookHasResearchAreaIterator = (BookHasResearchAreaIterator)findAncestorWithClass(this, BookHasResearchAreaIterator.class);
			pageContext.getOut().print(theBookHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

