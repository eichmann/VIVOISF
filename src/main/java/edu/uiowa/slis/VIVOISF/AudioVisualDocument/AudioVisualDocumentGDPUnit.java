package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentGDPUnitIterator theAudioVisualDocument = (AudioVisualDocumentGDPUnitIterator)findAncestorWithClass(this, AudioVisualDocumentGDPUnitIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

