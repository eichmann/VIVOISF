package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionVolumeIterator theBookSection = (BookSectionVolumeIterator)findAncestorWithClass(this, BookSectionVolumeIterator.class);
			pageContext.getOut().print(theBookSection.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for volume tag ");
		}
		return SKIP_BODY;
	}
}

