package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionInformationResourceSupportedByIterator theBookSectionInformationResourceSupportedByIterator = (BookSectionInformationResourceSupportedByIterator)findAncestorWithClass(this, BookSectionInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theBookSectionInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

