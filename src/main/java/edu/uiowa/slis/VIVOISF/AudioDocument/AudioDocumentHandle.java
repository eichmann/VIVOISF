package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentHandleIterator theAudioDocument = (AudioDocumentHandleIterator)findAncestorWithClass(this, AudioDocumentHandleIterator.class);
			pageContext.getOut().print(theAudioDocument.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for handle tag ");
		}
		return SKIP_BODY;
	}
}

