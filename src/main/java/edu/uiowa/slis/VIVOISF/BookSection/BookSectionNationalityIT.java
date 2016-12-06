package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNationalityITIterator theBookSection = (BookSectionNationalityITIterator)findAncestorWithClass(this, BookSectionNationalityITIterator.class);
			pageContext.getOut().print(theBookSection.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

