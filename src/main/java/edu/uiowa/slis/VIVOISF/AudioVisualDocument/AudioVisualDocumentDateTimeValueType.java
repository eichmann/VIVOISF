package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentDateTimeValueIterator theAudioVisualDocumentDateTimeValueIterator = (AudioVisualDocumentDateTimeValueIterator)findAncestorWithClass(this, AudioVisualDocumentDateTimeValueIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

