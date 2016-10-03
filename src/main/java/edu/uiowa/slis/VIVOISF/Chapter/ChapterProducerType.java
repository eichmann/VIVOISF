package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterProducerIterator theChapterProducerIterator = (ChapterProducerIterator)findAncestorWithClass(this, ChapterProducerIterator.class);
			pageContext.getOut().print(theChapterProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for producer tag ");
		}
		return SKIP_BODY;
	}
}

