package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Speech theSpeech = (Speech)findAncestorWithClass(this, Speech.class);
			if (!theSpeech.commitNeeded) {
				pageContext.getOut().print(theSpeech.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Speech theSpeech = (Speech)findAncestorWithClass(this, Speech.class);
			return theSpeech.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Speech for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Speech theSpeech = (Speech)findAncestorWithClass(this, Speech.class);
			theSpeech.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for label tag ");
		}
	}
}

