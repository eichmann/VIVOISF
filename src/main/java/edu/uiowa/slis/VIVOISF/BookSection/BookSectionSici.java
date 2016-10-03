package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionSici currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionSiciIterator theBookSection = (BookSectionSiciIterator)findAncestorWithClass(this, BookSectionSiciIterator.class);
			pageContext.getOut().print(theBookSection.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for sici tag ");
		}
		return SKIP_BODY;
	}
}

