package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCodeISO2Iterator theBookSection = (BookSectionCodeISO2Iterator)findAncestorWithClass(this, BookSectionCodeISO2Iterator.class);
			pageContext.getOut().print(theBookSection.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

