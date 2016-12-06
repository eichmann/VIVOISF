package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentUrlIterator theAudioVisualDocument = (AudioVisualDocumentUrlIterator)findAncestorWithClass(this, AudioVisualDocumentUrlIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for url tag ");
		}
		return SKIP_BODY;
	}
}

