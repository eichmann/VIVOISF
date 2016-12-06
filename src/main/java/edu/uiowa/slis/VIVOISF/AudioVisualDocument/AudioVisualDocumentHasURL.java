package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasURLIterator theAudioVisualDocumentHasURLIterator = (AudioVisualDocumentHasURLIterator)findAncestorWithClass(this, AudioVisualDocumentHasURLIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

