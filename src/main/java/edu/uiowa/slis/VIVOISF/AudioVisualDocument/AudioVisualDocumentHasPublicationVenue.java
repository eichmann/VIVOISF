package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasPublicationVenueIterator theAudioVisualDocumentHasPublicationVenueIterator = (AudioVisualDocumentHasPublicationVenueIterator)findAncestorWithClass(this, AudioVisualDocumentHasPublicationVenueIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

