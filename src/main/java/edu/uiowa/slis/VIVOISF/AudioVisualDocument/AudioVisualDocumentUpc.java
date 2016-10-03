package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentUpcIterator theAudioVisualDocument = (AudioVisualDocumentUpcIterator)findAncestorWithClass(this, AudioVisualDocumentUpcIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for upc tag ");
		}
		return SKIP_BODY;
	}
}

