package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberIssuerInverseIterator theFacultyMemberIssuerInverseIterator = (FacultyMemberIssuerInverseIterator)findAncestorWithClass(this, FacultyMemberIssuerInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for issuer tag ");
		}
		return SKIP_BODY;
	}
}

