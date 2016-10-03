package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionOclcnumIterator theBookSection = (BookSectionOclcnumIterator)findAncestorWithClass(this, BookSectionOclcnumIterator.class);
			pageContext.getOut().print(theBookSection.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

