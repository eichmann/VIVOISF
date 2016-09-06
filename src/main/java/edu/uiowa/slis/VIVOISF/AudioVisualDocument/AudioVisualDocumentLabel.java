package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			if (!theAudioVisualDocument.commitNeeded) {
				pageContext.getOut().print(theAudioVisualDocument.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			return theAudioVisualDocument.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AudioVisualDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			theAudioVisualDocument.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for label tag ");
		}
	}
}

