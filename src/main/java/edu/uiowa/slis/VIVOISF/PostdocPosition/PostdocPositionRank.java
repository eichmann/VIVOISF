package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionRankIterator thePostdocPosition = (PostdocPositionRankIterator)findAncestorWithClass(this, PostdocPositionRankIterator.class);
			pageContext.getOut().print(thePostdocPosition.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for rank tag ");
		}
		return SKIP_BODY;
	}
}

