package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterPublisherIterator theChapterPublisherIterator = (ChapterPublisherIterator)findAncestorWithClass(this, ChapterPublisherIterator.class);
			pageContext.getOut().print(theChapterPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for publisher tag ");
		}
		return SKIP_BODY;
	}
}

