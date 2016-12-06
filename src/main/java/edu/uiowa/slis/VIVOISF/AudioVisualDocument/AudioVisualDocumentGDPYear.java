package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentGDPYearIterator theAudioVisualDocument = (AudioVisualDocumentGDPYearIterator)findAncestorWithClass(this, AudioVisualDocumentGDPYearIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

