package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookGeographicFocusIterator theBookGeographicFocusIterator = (BookGeographicFocusIterator)findAncestorWithClass(this, BookGeographicFocusIterator.class);
			pageContext.getOut().print(theBookGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

