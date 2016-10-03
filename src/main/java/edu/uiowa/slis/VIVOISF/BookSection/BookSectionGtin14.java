package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionGtin14Iterator theBookSection = (BookSectionGtin14Iterator)findAncestorWithClass(this, BookSectionGtin14Iterator.class);
			pageContext.getOut().print(theBookSection.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

