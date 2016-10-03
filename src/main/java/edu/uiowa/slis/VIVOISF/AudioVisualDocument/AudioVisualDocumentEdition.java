package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentEditionIterator theAudioVisualDocument = (AudioVisualDocumentEditionIterator)findAncestorWithClass(this, AudioVisualDocumentEditionIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for edition tag ");
		}
		return SKIP_BODY;
	}
}

