package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentShortTitleIterator theAudioVisualDocument = (AudioVisualDocumentShortTitleIterator)findAncestorWithClass(this, AudioVisualDocumentShortTitleIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

