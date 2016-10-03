package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(BookIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookIssuerIterator theBookIssuerIterator = (BookIssuerIterator)findAncestorWithClass(this, BookIssuerIterator.class);
			pageContext.getOut().print(theBookIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for issuer tag ");
		}
		return SKIP_BODY;
	}
}

