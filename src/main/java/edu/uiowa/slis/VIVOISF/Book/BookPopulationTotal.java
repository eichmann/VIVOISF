package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookPopulationTotalIterator theBook = (BookPopulationTotalIterator)findAncestorWithClass(this, BookPopulationTotalIterator.class);
			pageContext.getOut().print(theBook.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

