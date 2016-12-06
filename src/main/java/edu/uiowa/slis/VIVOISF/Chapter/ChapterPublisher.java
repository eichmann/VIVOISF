package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterPublisherIterator theChapterPublisherIterator = (ChapterPublisherIterator)findAncestorWithClass(this, ChapterPublisherIterator.class);
			pageContext.getOut().print(theChapterPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for publisher tag ");
		}
		return SKIP_BODY;
	}
}

