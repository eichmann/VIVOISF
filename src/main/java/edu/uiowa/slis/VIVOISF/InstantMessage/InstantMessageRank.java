package edu.uiowa.slis.VIVOISF.InstantMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstantMessageRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstantMessageRank currentInstance = null;
	private static final Log log = LogFactory.getLog(InstantMessageRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstantMessageRankIterator theInstantMessage = (InstantMessageRankIterator)findAncestorWithClass(this, InstantMessageRankIterator.class);
			pageContext.getOut().print(theInstantMessage.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing InstantMessage for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing InstantMessage for rank tag ");
		}
		return SKIP_BODY;
	}
}

