package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameShortENIterator theAudioVisualDocument = (AudioVisualDocumentNameShortENIterator)findAncestorWithClass(this, AudioVisualDocumentNameShortENIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

