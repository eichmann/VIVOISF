package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCodeDBPediaIDIterator theBookSection = (BookSectionCodeDBPediaIDIterator)findAncestorWithClass(this, BookSectionCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theBookSection.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

