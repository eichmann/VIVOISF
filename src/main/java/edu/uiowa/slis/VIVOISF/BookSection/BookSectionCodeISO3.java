package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCodeISO3Iterator theBookSection = (BookSectionCodeISO3Iterator)findAncestorWithClass(this, BookSectionCodeISO3Iterator.class);
			pageContext.getOut().print(theBookSection.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

