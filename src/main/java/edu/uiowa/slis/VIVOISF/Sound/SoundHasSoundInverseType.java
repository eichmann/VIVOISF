package edu.uiowa.slis.VIVOISF.Sound;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SoundHasSoundInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SoundHasSoundInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SoundHasSoundInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SoundHasSoundInverseIterator theSoundHasSoundInverseIterator = (SoundHasSoundInverseIterator)findAncestorWithClass(this, SoundHasSoundInverseIterator.class);
			pageContext.getOut().print(theSoundHasSoundInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Sound for hasSound tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sound for hasSound tag ");
		}
		return SKIP_BODY;
	}
}

