package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameOfficialFRIterator theBookSection = (BookSectionNameOfficialFRIterator)findAncestorWithClass(this, BookSectionNameOfficialFRIterator.class);
			pageContext.getOut().print(theBookSection.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

