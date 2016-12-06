package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameOfficialENIterator theAudioVisualDocument = (AudioVisualDocumentNameOfficialENIterator)findAncestorWithClass(this, AudioVisualDocumentNameOfficialENIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

