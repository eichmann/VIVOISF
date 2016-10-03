package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionEditionIterator theBookSection = (BookSectionEditionIterator)findAncestorWithClass(this, BookSectionEditionIterator.class);
			pageContext.getOut().print(theBookSection.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for edition tag ");
		}
		return SKIP_BODY;
	}
}

