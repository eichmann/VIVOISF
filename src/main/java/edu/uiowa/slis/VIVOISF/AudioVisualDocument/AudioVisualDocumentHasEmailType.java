package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasEmailIterator theAudioVisualDocumentHasEmailIterator = (AudioVisualDocumentHasEmailIterator)findAncestorWithClass(this, AudioVisualDocumentHasEmailIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

