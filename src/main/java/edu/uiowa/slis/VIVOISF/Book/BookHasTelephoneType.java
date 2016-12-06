package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookHasTelephoneIterator theBookHasTelephoneIterator = (BookHasTelephoneIterator)findAncestorWithClass(this, BookHasTelephoneIterator.class);
			pageContext.getOut().print(theBookHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

