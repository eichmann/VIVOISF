package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionRO_0000056Iterator theBookSectionRO_0000056Iterator = (BookSectionRO_0000056Iterator)findAncestorWithClass(this, BookSectionRO_0000056Iterator.class);
			pageContext.getOut().print(theBookSectionRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

