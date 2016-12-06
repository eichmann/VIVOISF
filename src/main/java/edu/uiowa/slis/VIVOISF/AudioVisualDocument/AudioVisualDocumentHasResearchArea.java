package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasResearchAreaIterator theAudioVisualDocumentHasResearchAreaIterator = (AudioVisualDocumentHasResearchAreaIterator)findAncestorWithClass(this, AudioVisualDocumentHasResearchAreaIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

