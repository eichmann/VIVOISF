package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentOwnerIterator theAudioVisualDocumentOwnerIterator = (AudioVisualDocumentOwnerIterator)findAncestorWithClass(this, AudioVisualDocumentOwnerIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for owner tag ");
		}
		return SKIP_BODY;
	}
}

