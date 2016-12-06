package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasTelephoneIterator theBookSectionHasTelephoneIterator = (BookSectionHasTelephoneIterator)findAncestorWithClass(this, BookSectionHasTelephoneIterator.class);
			pageContext.getOut().print(theBookSectionHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

