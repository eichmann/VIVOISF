package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameShortZHIterator theAudioVisualDocument = (AudioVisualDocumentNameShortZHIterator)findAncestorWithClass(this, AudioVisualDocumentNameShortZHIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

