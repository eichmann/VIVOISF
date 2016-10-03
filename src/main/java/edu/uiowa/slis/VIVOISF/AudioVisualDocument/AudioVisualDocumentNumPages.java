package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNumPagesIterator theAudioVisualDocument = (AudioVisualDocumentNumPagesIterator)findAncestorWithClass(this, AudioVisualDocumentNumPagesIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for numPages tag ");
		}
		return SKIP_BODY;
	}
}

