package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechVolumeIterator theSpeech = (SpeechVolumeIterator)findAncestorWithClass(this, SpeechVolumeIterator.class);
			pageContext.getOut().print(theSpeech.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for volume tag ");
		}
		return SKIP_BODY;
	}
}

