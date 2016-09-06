package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookDocumentationForIterator theBookDocumentationForIterator = (BookDocumentationForIterator)findAncestorWithClass(this, BookDocumentationForIterator.class);
			pageContext.getOut().print(theBookDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

