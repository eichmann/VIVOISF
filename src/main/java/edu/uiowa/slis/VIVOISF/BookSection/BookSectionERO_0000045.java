package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionERO_0000045Iterator theBookSection = (BookSectionERO_0000045Iterator)findAncestorWithClass(this, BookSectionERO_0000045Iterator.class);
			pageContext.getOut().print(theBookSection.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

