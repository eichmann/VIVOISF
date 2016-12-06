package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNationalityZHIterator theBookSection = (BookSectionNationalityZHIterator)findAncestorWithClass(this, BookSectionNationalityZHIterator.class);
			pageContext.getOut().print(theBookSection.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

