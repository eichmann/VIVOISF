package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptVolumeIterator theExcerpt = (ExcerptVolumeIterator)findAncestorWithClass(this, ExcerptVolumeIterator.class);
			pageContext.getOut().print(theExcerpt.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for volume tag ");
		}
		return SKIP_BODY;
	}
}

