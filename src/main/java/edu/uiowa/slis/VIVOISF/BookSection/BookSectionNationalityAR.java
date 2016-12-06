package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNationalityARIterator theBookSection = (BookSectionNationalityARIterator)findAncestorWithClass(this, BookSectionNationalityARIterator.class);
			pageContext.getOut().print(theBookSection.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

