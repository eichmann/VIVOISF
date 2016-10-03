package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionProducerIterator theBookSectionProducerIterator = (BookSectionProducerIterator)findAncestorWithClass(this, BookSectionProducerIterator.class);
			pageContext.getOut().print(theBookSectionProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for producer tag ");
		}
		return SKIP_BODY;
	}
}
