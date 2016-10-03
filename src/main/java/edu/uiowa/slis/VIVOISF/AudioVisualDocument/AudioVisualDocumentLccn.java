package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentLccnIterator theAudioVisualDocument = (AudioVisualDocumentLccnIterator)findAncestorWithClass(this, AudioVisualDocumentLccnIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for lccn tag ");
		}
		return SKIP_BODY;
	}
}

