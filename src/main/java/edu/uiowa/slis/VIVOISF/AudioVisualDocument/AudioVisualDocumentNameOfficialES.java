package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameOfficialESIterator theAudioVisualDocument = (AudioVisualDocumentNameOfficialESIterator)findAncestorWithClass(this, AudioVisualDocumentNameOfficialESIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

