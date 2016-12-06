package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			if (!theAudioVisualDocument.commitNeeded) {
				pageContext.getOut().print(theAudioVisualDocument.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			return theAudioVisualDocument.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing AudioVisualDocument for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			theAudioVisualDocument.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hideFromDisplay tag ");
		}
	}
}

