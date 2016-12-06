package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionPopulationUnitIterator theBookSection = (BookSectionPopulationUnitIterator)findAncestorWithClass(this, BookSectionPopulationUnitIterator.class);
			pageContext.getOut().print(theBookSection.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

