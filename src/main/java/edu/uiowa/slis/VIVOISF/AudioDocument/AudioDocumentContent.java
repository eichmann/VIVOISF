package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentContent currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentContentIterator theAudioDocument = (AudioDocumentContentIterator)findAncestorWithClass(this, AudioDocumentContentIterator.class);
			pageContext.getOut().print(theAudioDocument.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for content tag ");
		}
		return SKIP_BODY;
	}
}

