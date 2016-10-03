package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionLccnIterator theBookSection = (BookSectionLccnIterator)findAncestorWithClass(this, BookSectionLccnIterator.class);
			pageContext.getOut().print(theBookSection.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for lccn tag ");
		}
		return SKIP_BODY;
	}
}

