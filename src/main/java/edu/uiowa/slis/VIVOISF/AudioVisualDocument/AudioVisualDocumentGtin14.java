package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentGtin14Iterator theAudioVisualDocument = (AudioVisualDocumentGtin14Iterator)findAncestorWithClass(this, AudioVisualDocumentGtin14Iterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

