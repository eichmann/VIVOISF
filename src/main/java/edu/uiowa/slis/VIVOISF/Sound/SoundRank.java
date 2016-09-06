package edu.uiowa.slis.VIVOISF.Sound;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SoundRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SoundRank currentInstance = null;
	private static final Log log = LogFactory.getLog(SoundRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SoundRankIterator theSound = (SoundRankIterator)findAncestorWithClass(this, SoundRankIterator.class);
			pageContext.getOut().print(theSound.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Sound for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sound for rank tag ");
		}
		return SKIP_BODY;
	}
}

