package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentNumberIterator theAudioDocument = (AudioDocumentNumberIterator)findAncestorWithClass(this, AudioDocumentNumberIterator.class);
			pageContext.getOut().print(theAudioDocument.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for number tag ");
		}
		return SKIP_BODY;
	}
}

