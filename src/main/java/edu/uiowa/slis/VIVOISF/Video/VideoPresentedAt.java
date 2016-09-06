package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoPresentedAtIterator theVideoPresentedAtIterator = (VideoPresentedAtIterator)findAncestorWithClass(this, VideoPresentedAtIterator.class);
			pageContext.getOut().print(theVideoPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

