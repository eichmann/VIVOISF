package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionRankIterator theBookSection = (BookSectionRankIterator)findAncestorWithClass(this, BookSectionRankIterator.class);
			pageContext.getOut().print(theBookSection.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for rank tag ");
		}
		return SKIP_BODY;
	}
}

