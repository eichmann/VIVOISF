package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasMinLatitudeIterator theAudioVisualDocument = (AudioVisualDocumentHasMinLatitudeIterator)findAncestorWithClass(this, AudioVisualDocumentHasMinLatitudeIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

