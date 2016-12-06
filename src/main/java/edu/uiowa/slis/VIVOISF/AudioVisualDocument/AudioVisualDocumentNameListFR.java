package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameListFRIterator theAudioVisualDocument = (AudioVisualDocumentNameListFRIterator)findAncestorWithClass(this, AudioVisualDocumentNameListFRIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

