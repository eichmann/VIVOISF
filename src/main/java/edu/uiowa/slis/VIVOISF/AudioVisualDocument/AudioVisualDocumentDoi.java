package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentDoiIterator theAudioVisualDocument = (AudioVisualDocumentDoiIterator)findAncestorWithClass(this, AudioVisualDocumentDoiIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for doi tag ");
		}
		return SKIP_BODY;
	}
}

