package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentLandAreaTotalIterator theAudioVisualDocument = (AudioVisualDocumentLandAreaTotalIterator)findAncestorWithClass(this, AudioVisualDocumentLandAreaTotalIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

