package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionARG_0000001Iterator theBookSection = (BookSectionARG_0000001Iterator)findAncestorWithClass(this, BookSectionARG_0000001Iterator.class);
			pageContext.getOut().print(theBookSection.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

