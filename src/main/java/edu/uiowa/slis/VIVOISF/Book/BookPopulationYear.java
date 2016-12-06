package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookPopulationYearIterator theBook = (BookPopulationYearIterator)findAncestorWithClass(this, BookPopulationYearIterator.class);
			pageContext.getOut().print(theBook.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

