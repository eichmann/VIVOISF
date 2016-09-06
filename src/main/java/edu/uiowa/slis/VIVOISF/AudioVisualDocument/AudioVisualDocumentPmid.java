package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentPmidIterator theAudioVisualDocument = (AudioVisualDocumentPmidIterator)findAncestorWithClass(this, AudioVisualDocumentPmidIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for pmid tag ");
		}
		return SKIP_BODY;
	}
}

