package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperVolumeIterator theConferencePaper = (ConferencePaperVolumeIterator)findAncestorWithClass(this, ConferencePaperVolumeIterator.class);
			pageContext.getOut().print(theConferencePaper.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for volume tag ");
		}
		return SKIP_BODY;
	}
}

