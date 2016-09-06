package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionPmidIterator theBookSection = (BookSectionPmidIterator)findAncestorWithClass(this, BookSectionPmidIterator.class);
			pageContext.getOut().print(theBookSection.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for pmid tag ");
		}
		return SKIP_BODY;
	}
}

