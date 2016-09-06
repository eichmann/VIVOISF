package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseVolumeIterator theNewsRelease = (NewsReleaseVolumeIterator)findAncestorWithClass(this, NewsReleaseVolumeIterator.class);
			pageContext.getOut().print(theNewsRelease.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for volume tag ");
		}
		return SKIP_BODY;
	}
}

