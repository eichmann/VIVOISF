package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoProducerIterator theVideoProducerIterator = (VideoProducerIterator)findAncestorWithClass(this, VideoProducerIterator.class);
			pageContext.getOut().print(theVideoProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for producer tag ");
		}
		return SKIP_BODY;
	}
}

