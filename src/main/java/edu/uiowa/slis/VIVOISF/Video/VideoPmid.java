package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoPmidIterator theVideo = (VideoPmidIterator)findAncestorWithClass(this, VideoPmidIterator.class);
			pageContext.getOut().print(theVideo.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for pmid tag ");
		}
		return SKIP_BODY;
	}
}

