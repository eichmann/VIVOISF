package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherRank currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherRankIterator thePublisher = (PublisherRankIterator)findAncestorWithClass(this, PublisherRankIterator.class);
			pageContext.getOut().print(thePublisher.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for rank tag ");
		}
		return SKIP_BODY;
	}
}

