package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			if (!theAudioVisualDocument.commitNeeded) {
				pageContext.getOut().print(theAudioVisualDocument.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			return theAudioVisualDocument.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing AudioVisualDocument for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			theAudioVisualDocument.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for placeOfPublication tag ");
		}
	}
}

