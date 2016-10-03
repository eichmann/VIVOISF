package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageTranscriptOfIterator theWebpageTranscriptOfIterator = (WebpageTranscriptOfIterator)findAncestorWithClass(this, WebpageTranscriptOfIterator.class);
			pageContext.getOut().print(theWebpageTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

