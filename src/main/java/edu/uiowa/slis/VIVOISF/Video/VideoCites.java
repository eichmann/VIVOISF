package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoCites currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoCitesIterator theVideoCitesIterator = (VideoCitesIterator)findAncestorWithClass(this, VideoCitesIterator.class);
			pageContext.getOut().print(theVideoCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for cites tag ");
		}
		return SKIP_BODY;
	}
}

