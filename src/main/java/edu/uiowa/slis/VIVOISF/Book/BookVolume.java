package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(BookVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookVolumeIterator theBook = (BookVolumeIterator)findAncestorWithClass(this, BookVolumeIterator.class);
			pageContext.getOut().print(theBook.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for volume tag ");
		}
		return SKIP_BODY;
	}
}

