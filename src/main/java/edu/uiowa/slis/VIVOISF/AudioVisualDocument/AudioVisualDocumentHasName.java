package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasNameIterator theAudioVisualDocumentHasNameIterator = (AudioVisualDocumentHasNameIterator)findAncestorWithClass(this, AudioVisualDocumentHasNameIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasName tag ");
		}
		return SKIP_BODY;
	}
}

