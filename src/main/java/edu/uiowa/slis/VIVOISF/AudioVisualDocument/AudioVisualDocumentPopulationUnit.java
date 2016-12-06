package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentPopulationUnitIterator theAudioVisualDocument = (AudioVisualDocumentPopulationUnitIterator)findAncestorWithClass(this, AudioVisualDocumentPopulationUnitIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

