package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionIssuerIterator theBookSectionIssuerIterator = (BookSectionIssuerIterator)findAncestorWithClass(this, BookSectionIssuerIterator.class);
			pageContext.getOut().print(theBookSectionIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for issuer tag ");
		}
		return SKIP_BODY;
	}
}
