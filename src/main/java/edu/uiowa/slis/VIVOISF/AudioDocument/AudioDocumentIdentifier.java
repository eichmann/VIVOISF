package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentIdentifierIterator theAudioDocument = (AudioDocumentIdentifierIterator)findAncestorWithClass(this, AudioDocumentIdentifierIterator.class);
			pageContext.getOut().print(theAudioDocument.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for identifier tag ");
		}
		return SKIP_BODY;
	}
}

