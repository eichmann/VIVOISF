package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseTranscriptOfIterator theNewsReleaseTranscriptOfIterator = (NewsReleaseTranscriptOfIterator)findAncestorWithClass(this, NewsReleaseTranscriptOfIterator.class);
			pageContext.getOut().print(theNewsReleaseTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

