package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookRelatedByIterator theBookRelatedByIterator = (BookRelatedByIterator)findAncestorWithClass(this, BookRelatedByIterator.class);
			pageContext.getOut().print(theBookRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

