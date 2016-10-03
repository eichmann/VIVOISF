package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoContributorListIterator theVideoContributorListIterator = (VideoContributorListIterator)findAncestorWithClass(this, VideoContributorListIterator.class);
			pageContext.getOut().print(theVideoContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

