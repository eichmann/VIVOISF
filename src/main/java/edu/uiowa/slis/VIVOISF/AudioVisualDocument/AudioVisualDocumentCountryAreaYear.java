package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCountryAreaYearIterator theAudioVisualDocument = (AudioVisualDocumentCountryAreaYearIterator)findAncestorWithClass(this, AudioVisualDocumentCountryAreaYearIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

