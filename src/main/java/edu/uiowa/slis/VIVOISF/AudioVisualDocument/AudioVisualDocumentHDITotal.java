package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHDITotalIterator theAudioVisualDocument = (AudioVisualDocumentHDITotalIterator)findAncestorWithClass(this, AudioVisualDocumentHDITotalIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

