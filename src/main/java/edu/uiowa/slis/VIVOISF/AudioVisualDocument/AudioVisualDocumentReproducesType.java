package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentReproducesIterator theAudioVisualDocumentReproducesIterator = (AudioVisualDocumentReproducesIterator)findAncestorWithClass(this, AudioVisualDocumentReproducesIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

