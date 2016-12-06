package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameOfficialESIterator theBookSection = (BookSectionNameOfficialESIterator)findAncestorWithClass(this, BookSectionNameOfficialESIterator.class);
			pageContext.getOut().print(theBookSection.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}
