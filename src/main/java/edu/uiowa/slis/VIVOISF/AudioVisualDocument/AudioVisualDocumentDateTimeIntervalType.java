package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentDateTimeIntervalIterator theAudioVisualDocumentDateTimeIntervalIterator = (AudioVisualDocumentDateTimeIntervalIterator)findAncestorWithClass(this, AudioVisualDocumentDateTimeIntervalIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

