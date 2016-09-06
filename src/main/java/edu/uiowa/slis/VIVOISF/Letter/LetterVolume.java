package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterVolumeIterator theLetter = (LetterVolumeIterator)findAncestorWithClass(this, LetterVolumeIterator.class);
			pageContext.getOut().print(theLetter.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for volume tag ");
		}
		return SKIP_BODY;
	}
}

