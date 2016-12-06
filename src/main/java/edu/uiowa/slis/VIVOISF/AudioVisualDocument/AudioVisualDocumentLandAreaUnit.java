package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentLandAreaUnitIterator theAudioVisualDocument = (AudioVisualDocumentLandAreaUnitIterator)findAncestorWithClass(this, AudioVisualDocumentLandAreaUnitIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

