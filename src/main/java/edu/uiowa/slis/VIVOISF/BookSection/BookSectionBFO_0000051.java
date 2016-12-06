package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionBFO_0000051Iterator theBookSectionBFO_0000051Iterator = (BookSectionBFO_0000051Iterator)findAncestorWithClass(this, BookSectionBFO_0000051Iterator.class);
			pageContext.getOut().print(theBookSectionBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

