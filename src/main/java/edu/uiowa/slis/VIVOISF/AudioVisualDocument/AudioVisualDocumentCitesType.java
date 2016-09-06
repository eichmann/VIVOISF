package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCitesIterator theAudioVisualDocumentCitesIterator = (AudioVisualDocumentCitesIterator)findAncestorWithClass(this, AudioVisualDocumentCitesIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for cites tag ");
		}
		return SKIP_BODY;
	}
}

