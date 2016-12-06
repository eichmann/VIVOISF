package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameOfficialFRIterator theAudioVisualDocument = (AudioVisualDocumentNameOfficialFRIterator)findAncestorWithClass(this, AudioVisualDocumentNameOfficialFRIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

