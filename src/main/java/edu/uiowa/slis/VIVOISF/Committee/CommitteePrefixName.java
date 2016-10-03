package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteePrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteePrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteePrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommitteePrefixNameIterator theCommittee = (CommitteePrefixNameIterator)findAncestorWithClass(this, CommitteePrefixNameIterator.class);
			pageContext.getOut().print(theCommittee.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

