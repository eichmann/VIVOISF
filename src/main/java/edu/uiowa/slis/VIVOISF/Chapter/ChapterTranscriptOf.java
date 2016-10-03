package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterTranscriptOfIterator theChapterTranscriptOfIterator = (ChapterTranscriptOfIterator)findAncestorWithClass(this, ChapterTranscriptOfIterator.class);
			pageContext.getOut().print(theChapterTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

