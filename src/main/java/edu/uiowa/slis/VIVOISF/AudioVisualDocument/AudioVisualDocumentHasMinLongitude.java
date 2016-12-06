package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasMinLongitudeIterator theAudioVisualDocument = (AudioVisualDocumentHasMinLongitudeIterator)findAncestorWithClass(this, AudioVisualDocumentHasMinLongitudeIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

