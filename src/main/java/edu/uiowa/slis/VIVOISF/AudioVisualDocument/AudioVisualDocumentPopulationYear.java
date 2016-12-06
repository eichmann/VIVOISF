package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentPopulationYearIterator theAudioVisualDocument = (AudioVisualDocumentPopulationYearIterator)findAncestorWithClass(this, AudioVisualDocumentPopulationYearIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

