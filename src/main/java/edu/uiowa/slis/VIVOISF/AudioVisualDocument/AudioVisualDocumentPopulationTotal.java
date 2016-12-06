package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentPopulationTotalIterator theAudioVisualDocument = (AudioVisualDocumentPopulationTotalIterator)findAncestorWithClass(this, AudioVisualDocumentPopulationTotalIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

