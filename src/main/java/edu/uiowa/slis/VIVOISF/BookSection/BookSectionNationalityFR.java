package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNationalityFRIterator theBookSection = (BookSectionNationalityFRIterator)findAncestorWithClass(this, BookSectionNationalityFRIterator.class);
			pageContext.getOut().print(theBookSection.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

