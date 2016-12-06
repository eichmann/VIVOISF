package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameListESIterator theAudioVisualDocument = (AudioVisualDocumentNameListESIterator)findAncestorWithClass(this, AudioVisualDocumentNameListESIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

