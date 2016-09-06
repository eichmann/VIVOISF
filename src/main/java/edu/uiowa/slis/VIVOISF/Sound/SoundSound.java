package edu.uiowa.slis.VIVOISF.Sound;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SoundSound extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SoundSound currentInstance = null;
	private static final Log log = LogFactory.getLog(SoundSound.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SoundSoundIterator theSound = (SoundSoundIterator)findAncestorWithClass(this, SoundSoundIterator.class);
			pageContext.getOut().print(theSound.getSound());
		} catch (Exception e) {
			log.error("Can't find enclosing Sound for sound tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sound for sound tag ");
		}
		return SKIP_BODY;
	}
}

