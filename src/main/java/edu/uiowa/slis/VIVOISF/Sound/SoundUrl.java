package edu.uiowa.slis.VIVOISF.Sound;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SoundUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SoundUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(SoundUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SoundUrlIterator theSound = (SoundUrlIterator)findAncestorWithClass(this, SoundUrlIterator.class);
			pageContext.getOut().print(theSound.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Sound for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sound for url tag ");
		}
		return SKIP_BODY;
	}
}

