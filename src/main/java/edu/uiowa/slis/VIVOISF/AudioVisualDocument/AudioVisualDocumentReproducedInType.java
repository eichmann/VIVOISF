package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentReproducedInIterator theAudioVisualDocumentReproducedInIterator = (AudioVisualDocumentReproducedInIterator)findAncestorWithClass(this, AudioVisualDocumentReproducedInIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

