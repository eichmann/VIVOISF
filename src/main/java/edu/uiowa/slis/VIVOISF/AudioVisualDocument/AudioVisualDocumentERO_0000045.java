package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentERO_0000045Iterator theAudioVisualDocument = (AudioVisualDocumentERO_0000045Iterator)findAncestorWithClass(this, AudioVisualDocumentERO_0000045Iterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

