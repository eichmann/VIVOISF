package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailRank currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailRankIterator theEmail = (EmailRankIterator)findAncestorWithClass(this, EmailRankIterator.class);
			pageContext.getOut().print(theEmail.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for rank tag ");
		}
		return SKIP_BODY;
	}
}

