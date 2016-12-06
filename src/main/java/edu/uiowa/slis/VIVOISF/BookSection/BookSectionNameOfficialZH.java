package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameOfficialZHIterator theBookSection = (BookSectionNameOfficialZHIterator)findAncestorWithClass(this, BookSectionNameOfficialZHIterator.class);
			pageContext.getOut().print(theBookSection.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

