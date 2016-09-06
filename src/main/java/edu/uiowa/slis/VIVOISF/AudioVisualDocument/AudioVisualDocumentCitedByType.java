package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCitedByIterator theAudioVisualDocumentCitedByIterator = (AudioVisualDocumentCitedByIterator)findAncestorWithClass(this, AudioVisualDocumentCitedByIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

