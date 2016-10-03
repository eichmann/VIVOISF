package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionEanucc13Iterator theBookSection = (BookSectionEanucc13Iterator)findAncestorWithClass(this, BookSectionEanucc13Iterator.class);
			pageContext.getOut().print(theBookSection.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

