package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookDistributorIterator theBookDistributorIterator = (BookDistributorIterator)findAncestorWithClass(this, BookDistributorIterator.class);
			pageContext.getOut().print(theBookDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for distributor tag ");
		}
		return SKIP_BODY;
	}
}

