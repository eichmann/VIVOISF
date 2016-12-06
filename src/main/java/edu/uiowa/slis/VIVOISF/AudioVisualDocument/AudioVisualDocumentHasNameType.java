package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasNameIterator theAudioVisualDocumentHasNameIterator = (AudioVisualDocumentHasNameIterator)findAncestorWithClass(this, AudioVisualDocumentHasNameIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasName tag ");
		}
		return SKIP_BODY;
	}
}

