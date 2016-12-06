package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentAgriculturalAreaUnitIterator theAudioVisualDocument = (AudioVisualDocumentAgriculturalAreaUnitIterator)findAncestorWithClass(this, AudioVisualDocumentAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

