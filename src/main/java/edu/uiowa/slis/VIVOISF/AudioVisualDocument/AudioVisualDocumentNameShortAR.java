package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameShortARIterator theAudioVisualDocument = (AudioVisualDocumentNameShortARIterator)findAncestorWithClass(this, AudioVisualDocumentNameShortARIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

