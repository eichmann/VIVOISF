package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookTranscriptOfIterator theBookTranscriptOfIterator = (BookTranscriptOfIterator)findAncestorWithClass(this, BookTranscriptOfIterator.class);
			pageContext.getOut().print(theBookTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

