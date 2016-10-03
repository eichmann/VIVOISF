package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentSici currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentSiciIterator theAudioDocument = (AudioDocumentSiciIterator)findAncestorWithClass(this, AudioDocumentSiciIterator.class);
			pageContext.getOut().print(theAudioDocument.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for sici tag ");
		}
		return SKIP_BODY;
	}
}

