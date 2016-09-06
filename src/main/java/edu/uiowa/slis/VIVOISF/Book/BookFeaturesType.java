package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookFeaturesIterator theBookFeaturesIterator = (BookFeaturesIterator)findAncestorWithClass(this, BookFeaturesIterator.class);
			pageContext.getOut().print(theBookFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for features tag ");
		}
		return SKIP_BODY;
	}
}

