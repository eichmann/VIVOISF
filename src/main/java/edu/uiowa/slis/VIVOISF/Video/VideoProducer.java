package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoProducerIterator theVideoProducerIterator = (VideoProducerIterator)findAncestorWithClass(this, VideoProducerIterator.class);
			pageContext.getOut().print(theVideoProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for producer tag ");
		}
		return SKIP_BODY;
	}
}

