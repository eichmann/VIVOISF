package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentPresentedAtIterator theAudioVisualDocumentPresentedAtIterator = (AudioVisualDocumentPresentedAtIterator)findAncestorWithClass(this, AudioVisualDocumentPresentedAtIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

