package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentCodenIterator theAudioDocument = (AudioDocumentCodenIterator)findAncestorWithClass(this, AudioDocumentCodenIterator.class);
			pageContext.getOut().print(theAudioDocument.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for coden tag ");
		}
		return SKIP_BODY;
	}
}

