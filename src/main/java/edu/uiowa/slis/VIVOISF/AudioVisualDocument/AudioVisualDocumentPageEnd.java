package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentPageEndIterator theAudioVisualDocument = (AudioVisualDocumentPageEndIterator)findAncestorWithClass(this, AudioVisualDocumentPageEndIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

