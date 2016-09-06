package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookInformationResourceSupportedByIterator theBookInformationResourceSupportedByIterator = (BookInformationResourceSupportedByIterator)findAncestorWithClass(this, BookInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theBookInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

