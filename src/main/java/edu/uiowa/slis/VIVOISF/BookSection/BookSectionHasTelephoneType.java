package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasTelephoneIterator theBookSectionHasTelephoneIterator = (BookSectionHasTelephoneIterator)findAncestorWithClass(this, BookSectionHasTelephoneIterator.class);
			pageContext.getOut().print(theBookSectionHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

