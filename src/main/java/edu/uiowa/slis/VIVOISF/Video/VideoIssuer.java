package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoIssuerIterator theVideoIssuerIterator = (VideoIssuerIterator)findAncestorWithClass(this, VideoIssuerIterator.class);
			pageContext.getOut().print(theVideoIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for issuer tag ");
		}
		return SKIP_BODY;
	}
}

