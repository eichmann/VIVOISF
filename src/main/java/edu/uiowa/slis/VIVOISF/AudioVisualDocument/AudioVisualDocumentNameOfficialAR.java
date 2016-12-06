package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameOfficialARIterator theAudioVisualDocument = (AudioVisualDocumentNameOfficialARIterator)findAncestorWithClass(this, AudioVisualDocumentNameOfficialARIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

