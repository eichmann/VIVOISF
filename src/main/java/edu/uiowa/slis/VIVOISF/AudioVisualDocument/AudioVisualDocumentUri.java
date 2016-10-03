package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentUri currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentUriIterator theAudioVisualDocument = (AudioVisualDocumentUriIterator)findAncestorWithClass(this, AudioVisualDocumentUriIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for uri tag ");
		}
		return SKIP_BODY;
	}
}

