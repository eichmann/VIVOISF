package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentSici currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentSiciIterator theAudioVisualDocument = (AudioVisualDocumentSiciIterator)findAncestorWithClass(this, AudioVisualDocumentSiciIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for sici tag ");
		}
		return SKIP_BODY;
	}
}

