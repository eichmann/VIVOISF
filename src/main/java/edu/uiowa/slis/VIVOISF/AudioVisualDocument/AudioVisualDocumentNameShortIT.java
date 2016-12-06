package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameShortITIterator theAudioVisualDocument = (AudioVisualDocumentNameShortITIterator)findAncestorWithClass(this, AudioVisualDocumentNameShortITIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

