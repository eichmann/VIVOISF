package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHandleIterator theAudioVisualDocument = (AudioVisualDocumentHandleIterator)findAncestorWithClass(this, AudioVisualDocumentHandleIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for handle tag ");
		}
		return SKIP_BODY;
	}
}

