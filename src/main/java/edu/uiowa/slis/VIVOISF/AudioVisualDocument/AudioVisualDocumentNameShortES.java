package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameShortESIterator theAudioVisualDocument = (AudioVisualDocumentNameShortESIterator)findAncestorWithClass(this, AudioVisualDocumentNameShortESIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

