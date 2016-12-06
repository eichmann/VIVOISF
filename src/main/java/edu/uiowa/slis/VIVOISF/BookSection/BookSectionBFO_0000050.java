package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionBFO_0000050Iterator theBookSectionBFO_0000050Iterator = (BookSectionBFO_0000050Iterator)findAncestorWithClass(this, BookSectionBFO_0000050Iterator.class);
			pageContext.getOut().print(theBookSectionBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

