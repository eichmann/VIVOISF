package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageVolumeIterator theWebpage = (WebpageVolumeIterator)findAncestorWithClass(this, WebpageVolumeIterator.class);
			pageContext.getOut().print(theWebpage.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for volume tag ");
		}
		return SKIP_BODY;
	}
}

