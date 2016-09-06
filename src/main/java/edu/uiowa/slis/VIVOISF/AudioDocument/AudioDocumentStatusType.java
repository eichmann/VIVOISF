package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentStatusIterator theAudioDocumentStatusIterator = (AudioDocumentStatusIterator)findAncestorWithClass(this, AudioDocumentStatusIterator.class);
			pageContext.getOut().print(theAudioDocumentStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for status tag ");
		}
		return SKIP_BODY;
	}
}

