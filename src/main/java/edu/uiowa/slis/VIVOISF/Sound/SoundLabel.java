package edu.uiowa.slis.VIVOISF.Sound;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SoundLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SoundLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SoundLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Sound theSound = (Sound)findAncestorWithClass(this, Sound.class);
			if (!theSound.commitNeeded) {
				pageContext.getOut().print(theSound.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Sound for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sound for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Sound theSound = (Sound)findAncestorWithClass(this, Sound.class);
			return theSound.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Sound for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sound for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Sound theSound = (Sound)findAncestorWithClass(this, Sound.class);
			theSound.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Sound for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sound for label tag ");
		}
	}
}

