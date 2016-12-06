package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentAgriculturalAreaYearIterator theAudioVisualDocument = (AudioVisualDocumentAgriculturalAreaYearIterator)findAncestorWithClass(this, AudioVisualDocumentAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}
