package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoDistributorIterator theVideoDistributorIterator = (VideoDistributorIterator)findAncestorWithClass(this, VideoDistributorIterator.class);
			pageContext.getOut().print(theVideoDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for distributor tag ");
		}
		return SKIP_BODY;
	}
}

