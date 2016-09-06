package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoInformationResourceSupportedByIterator theVideoInformationResourceSupportedByIterator = (VideoInformationResourceSupportedByIterator)findAncestorWithClass(this, VideoInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theVideoInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

