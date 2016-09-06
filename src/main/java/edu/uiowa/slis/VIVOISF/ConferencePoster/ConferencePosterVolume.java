package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterVolumeIterator theConferencePoster = (ConferencePosterVolumeIterator)findAncestorWithClass(this, ConferencePosterVolumeIterator.class);
			pageContext.getOut().print(theConferencePoster.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for volume tag ");
		}
		return SKIP_BODY;
	}
}

