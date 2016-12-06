package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasAddressIterator theAudioVisualDocumentHasAddressIterator = (AudioVisualDocumentHasAddressIterator)findAncestorWithClass(this, AudioVisualDocumentHasAddressIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

