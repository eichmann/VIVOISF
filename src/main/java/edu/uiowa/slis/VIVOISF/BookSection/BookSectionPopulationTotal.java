package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionPopulationTotalIterator theBookSection = (BookSectionPopulationTotalIterator)findAncestorWithClass(this, BookSectionPopulationTotalIterator.class);
			pageContext.getOut().print(theBookSection.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

