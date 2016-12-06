package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameOfficialARIterator theBookSection = (BookSectionNameOfficialARIterator)findAncestorWithClass(this, BookSectionNameOfficialARIterator.class);
			pageContext.getOut().print(theBookSection.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

