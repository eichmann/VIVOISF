package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipRank currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipRankIterator theAuthorship = (AuthorshipRankIterator)findAncestorWithClass(this, AuthorshipRankIterator.class);
			pageContext.getOut().print(theAuthorship.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for rank tag ");
		}
		return SKIP_BODY;
	}
}

