package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameOfficialITIterator theAudioVisualDocument = (AudioVisualDocumentNameOfficialITIterator)findAncestorWithClass(this, AudioVisualDocumentNameOfficialITIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

