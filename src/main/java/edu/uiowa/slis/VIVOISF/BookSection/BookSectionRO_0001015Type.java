package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionRO_0001015Iterator theBookSectionRO_0001015Iterator = (BookSectionRO_0001015Iterator)findAncestorWithClass(this, BookSectionRO_0001015Iterator.class);
			pageContext.getOut().print(theBookSectionRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

