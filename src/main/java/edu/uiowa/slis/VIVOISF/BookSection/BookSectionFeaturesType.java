package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionFeaturesIterator theBookSectionFeaturesIterator = (BookSectionFeaturesIterator)findAncestorWithClass(this, BookSectionFeaturesIterator.class);
			pageContext.getOut().print(theBookSectionFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for features tag ");
		}
		return SKIP_BODY;
	}
}

