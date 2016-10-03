package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterProducerIterator theChapterProducerIterator = (ChapterProducerIterator)findAncestorWithClass(this, ChapterProducerIterator.class);
			pageContext.getOut().print(theChapterProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for producer tag ");
		}
		return SKIP_BODY;
	}
}

