package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCitedByIterator theAudioVisualDocumentCitedByIterator = (AudioVisualDocumentCitedByIterator)findAncestorWithClass(this, AudioVisualDocumentCitedByIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

