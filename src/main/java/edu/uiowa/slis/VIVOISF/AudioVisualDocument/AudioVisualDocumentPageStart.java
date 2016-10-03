package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentPageStartIterator theAudioVisualDocument = (AudioVisualDocumentPageStartIterator)findAncestorWithClass(this, AudioVisualDocumentPageStartIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

