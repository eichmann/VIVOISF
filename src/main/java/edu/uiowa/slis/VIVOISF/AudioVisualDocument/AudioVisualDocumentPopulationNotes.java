package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentPopulationNotesIterator theAudioVisualDocument = (AudioVisualDocumentPopulationNotesIterator)findAncestorWithClass(this, AudioVisualDocumentPopulationNotesIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

