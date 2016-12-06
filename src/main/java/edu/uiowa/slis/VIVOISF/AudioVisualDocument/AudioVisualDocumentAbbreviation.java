package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			if (!theAudioVisualDocument.commitNeeded) {
				pageContext.getOut().print(theAudioVisualDocument.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			return theAudioVisualDocument.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing AudioVisualDocument for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			theAudioVisualDocument.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for abbreviation tag ");
		}
	}
}

