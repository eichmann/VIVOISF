package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(BookFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookFeaturesIterator theBookFeaturesIterator = (BookFeaturesIterator)findAncestorWithClass(this, BookFeaturesIterator.class);
			pageContext.getOut().print(theBookFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for features tag ");
		}
		return SKIP_BODY;
	}
}

