package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechOclcnumIterator theSpeech = (SpeechOclcnumIterator)findAncestorWithClass(this, SpeechOclcnumIterator.class);
			pageContext.getOut().print(theSpeech.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}
