package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoInformationResourceSupportedByIterator theVideoInformationResourceSupportedByIterator = (VideoInformationResourceSupportedByIterator)findAncestorWithClass(this, VideoInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theVideoInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

