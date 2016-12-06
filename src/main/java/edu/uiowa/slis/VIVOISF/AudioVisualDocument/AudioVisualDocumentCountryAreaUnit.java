package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCountryAreaUnitIterator theAudioVisualDocument = (AudioVisualDocumentCountryAreaUnitIterator)findAncestorWithClass(this, AudioVisualDocumentCountryAreaUnitIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

