package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCodeDBPediaIDIterator theBook = (BookCodeDBPediaIDIterator)findAncestorWithClass(this, BookCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theBook.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

