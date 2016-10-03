package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(BookProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookProducerIterator theBookProducerIterator = (BookProducerIterator)findAncestorWithClass(this, BookProducerIterator.class);
			pageContext.getOut().print(theBookProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for producer tag ");
		}
		return SKIP_BODY;
	}
}

