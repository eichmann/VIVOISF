package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameOfficialZHIterator theAudioVisualDocument = (AudioVisualDocumentNameOfficialZHIterator)findAncestorWithClass(this, AudioVisualDocumentNameOfficialZHIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

