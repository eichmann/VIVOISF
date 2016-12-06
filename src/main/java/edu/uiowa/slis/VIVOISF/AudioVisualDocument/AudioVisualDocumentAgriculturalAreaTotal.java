package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentAgriculturalAreaTotalIterator theAudioVisualDocument = (AudioVisualDocumentAgriculturalAreaTotalIterator)findAncestorWithClass(this, AudioVisualDocumentAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

