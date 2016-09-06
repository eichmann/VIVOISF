package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteVolumeIterator theStatute = (StatuteVolumeIterator)findAncestorWithClass(this, StatuteVolumeIterator.class);
			pageContext.getOut().print(theStatute.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for volume tag ");
		}
		return SKIP_BODY;
	}
}

