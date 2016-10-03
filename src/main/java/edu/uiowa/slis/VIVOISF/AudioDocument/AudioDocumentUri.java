package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentUri currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentUriIterator theAudioDocument = (AudioDocumentUriIterator)findAncestorWithClass(this, AudioDocumentUriIterator.class);
			pageContext.getOut().print(theAudioDocument.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for uri tag ");
		}
		return SKIP_BODY;
	}
}

