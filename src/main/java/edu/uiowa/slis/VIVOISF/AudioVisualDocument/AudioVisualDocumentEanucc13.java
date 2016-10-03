package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentEanucc13Iterator theAudioVisualDocument = (AudioVisualDocumentEanucc13Iterator)findAncestorWithClass(this, AudioVisualDocumentEanucc13Iterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

