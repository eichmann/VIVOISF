package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefVolumeIterator theBrief = (BriefVolumeIterator)findAncestorWithClass(this, BriefVolumeIterator.class);
			pageContext.getOut().print(theBrief.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for volume tag ");
		}
		return SKIP_BODY;
	}
}

