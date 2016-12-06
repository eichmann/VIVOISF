package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCountryAreaTotalIterator theAudioVisualDocument = (AudioVisualDocumentCountryAreaTotalIterator)findAncestorWithClass(this, AudioVisualDocumentCountryAreaTotalIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

