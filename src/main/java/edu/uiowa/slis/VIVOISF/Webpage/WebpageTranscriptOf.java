package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageTranscriptOfIterator theWebpageTranscriptOfIterator = (WebpageTranscriptOfIterator)findAncestorWithClass(this, WebpageTranscriptOfIterator.class);
			pageContext.getOut().print(theWebpageTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

