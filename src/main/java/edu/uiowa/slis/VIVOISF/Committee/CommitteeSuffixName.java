package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommitteeSuffixNameIterator theCommittee = (CommitteeSuffixNameIterator)findAncestorWithClass(this, CommitteeSuffixNameIterator.class);
			pageContext.getOut().print(theCommittee.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

