package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionTranscriptOfIterator theBookSectionTranscriptOfIterator = (BookSectionTranscriptOfIterator)findAncestorWithClass(this, BookSectionTranscriptOfIterator.class);
			pageContext.getOut().print(theBookSectionTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

