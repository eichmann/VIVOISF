package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentIsbn13Iterator theAudioVisualDocument = (AudioVisualDocumentIsbn13Iterator)findAncestorWithClass(this, AudioVisualDocumentIsbn13Iterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

