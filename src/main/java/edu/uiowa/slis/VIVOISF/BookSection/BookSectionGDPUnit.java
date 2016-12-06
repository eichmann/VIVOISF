package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionGDPUnitIterator theBookSection = (BookSectionGDPUnitIterator)findAncestorWithClass(this, BookSectionGDPUnitIterator.class);
			pageContext.getOut().print(theBookSection.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

