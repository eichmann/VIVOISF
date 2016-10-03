package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentIsbn10Iterator theAudioVisualDocument = (AudioVisualDocumentIsbn10Iterator)findAncestorWithClass(this, AudioVisualDocumentIsbn10Iterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

