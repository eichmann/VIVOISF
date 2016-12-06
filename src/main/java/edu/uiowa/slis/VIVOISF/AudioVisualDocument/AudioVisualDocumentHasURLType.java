package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasURLIterator theAudioVisualDocumentHasURLIterator = (AudioVisualDocumentHasURLIterator)findAncestorWithClass(this, AudioVisualDocumentHasURLIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

