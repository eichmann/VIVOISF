package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoAuthorListIterator theVideoAuthorListIterator = (VideoAuthorListIterator)findAncestorWithClass(this, VideoAuthorListIterator.class);
			pageContext.getOut().print(theVideoAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for authorList tag ");
		}
		return SKIP_BODY;
	}
}

