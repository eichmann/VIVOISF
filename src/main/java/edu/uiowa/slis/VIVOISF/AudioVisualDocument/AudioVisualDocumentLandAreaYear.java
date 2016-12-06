package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentLandAreaYearIterator theAudioVisualDocument = (AudioVisualDocumentLandAreaYearIterator)findAncestorWithClass(this, AudioVisualDocumentLandAreaYearIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

