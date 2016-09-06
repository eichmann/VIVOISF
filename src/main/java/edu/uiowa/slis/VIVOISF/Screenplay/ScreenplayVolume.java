package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayVolumeIterator theScreenplay = (ScreenplayVolumeIterator)findAncestorWithClass(this, ScreenplayVolumeIterator.class);
			pageContext.getOut().print(theScreenplay.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for volume tag ");
		}
		return SKIP_BODY;
	}
}

