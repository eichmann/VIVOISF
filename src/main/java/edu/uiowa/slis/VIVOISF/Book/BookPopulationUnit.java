package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookPopulationUnitIterator theBook = (BookPopulationUnitIterator)findAncestorWithClass(this, BookPopulationUnitIterator.class);
			pageContext.getOut().print(theBook.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

