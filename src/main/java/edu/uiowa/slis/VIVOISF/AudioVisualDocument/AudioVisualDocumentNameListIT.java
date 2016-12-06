package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameListITIterator theAudioVisualDocument = (AudioVisualDocumentNameListITIterator)findAncestorWithClass(this, AudioVisualDocumentNameListITIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

