package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoContributorListIterator theVideoContributorListIterator = (VideoContributorListIterator)findAncestorWithClass(this, VideoContributorListIterator.class);
			pageContext.getOut().print(theVideoContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

