package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameShortFRIterator theAudioVisualDocument = (AudioVisualDocumentNameShortFRIterator)findAncestorWithClass(this, AudioVisualDocumentNameShortFRIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

