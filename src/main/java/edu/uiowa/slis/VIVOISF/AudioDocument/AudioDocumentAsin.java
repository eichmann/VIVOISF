package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentAsinIterator theAudioDocument = (AudioDocumentAsinIterator)findAncestorWithClass(this, AudioDocumentAsinIterator.class);
			pageContext.getOut().print(theAudioDocument.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for asin tag ");
		}
		return SKIP_BODY;
	}
}

