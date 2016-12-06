package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentFreetextKeywordIterator theAudioVisualDocument = (AudioVisualDocumentFreetextKeywordIterator)findAncestorWithClass(this, AudioVisualDocumentFreetextKeywordIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

