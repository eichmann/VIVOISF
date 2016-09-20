package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechERO_0000045Iterator theSpeech = (SpeechERO_0000045Iterator)findAncestorWithClass(this, SpeechERO_0000045Iterator.class);
			pageContext.getOut().print(theSpeech.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

