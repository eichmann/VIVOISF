package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionDocumentationForIterator theBookSectionDocumentationForIterator = (BookSectionDocumentationForIterator)findAncestorWithClass(this, BookSectionDocumentationForIterator.class);
			pageContext.getOut().print(theBookSectionDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

