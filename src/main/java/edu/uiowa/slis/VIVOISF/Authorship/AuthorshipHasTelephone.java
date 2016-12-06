package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasTelephoneIterator theAuthorshipHasTelephoneIterator = (AuthorshipHasTelephoneIterator)findAncestorWithClass(this, AuthorshipHasTelephoneIterator.class);
			pageContext.getOut().print(theAuthorshipHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

