package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionPopulationYearIterator theBookSection = (BookSectionPopulationYearIterator)findAncestorWithClass(this, BookSectionPopulationYearIterator.class);
			pageContext.getOut().print(theBookSection.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

