package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentOwnerIterator theAudioVisualDocumentOwnerIterator = (AudioVisualDocumentOwnerIterator)findAncestorWithClass(this, AudioVisualDocumentOwnerIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for owner tag ");
		}
		return SKIP_BODY;
	}
}

