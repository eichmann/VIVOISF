package edu.uiowa.slis.VIVOISF.Voice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VoiceLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VoiceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(VoiceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Voice theVoice = (Voice)findAncestorWithClass(this, Voice.class);
			if (!theVoice.commitNeeded) {
				pageContext.getOut().print(theVoice.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Voice for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Voice for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Voice theVoice = (Voice)findAncestorWithClass(this, Voice.class);
			return theVoice.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Voice for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Voice for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Voice theVoice = (Voice)findAncestorWithClass(this, Voice.class);
			theVoice.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Voice for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Voice for label tag ");
		}
	}
}

