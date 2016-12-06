package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameOfficialITIterator theBookSection = (BookSectionNameOfficialITIterator)findAncestorWithClass(this, BookSectionNameOfficialITIterator.class);
			pageContext.getOut().print(theBookSection.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

