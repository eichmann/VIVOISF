package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameOfficialARIterator theBook = (BookNameOfficialARIterator)findAncestorWithClass(this, BookNameOfficialARIterator.class);
			pageContext.getOut().print(theBook.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

