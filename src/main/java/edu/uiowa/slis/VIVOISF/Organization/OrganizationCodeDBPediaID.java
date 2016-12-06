package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCodeDBPediaIDIterator theOrganization = (OrganizationCodeDBPediaIDIterator)findAncestorWithClass(this, OrganizationCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theOrganization.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

