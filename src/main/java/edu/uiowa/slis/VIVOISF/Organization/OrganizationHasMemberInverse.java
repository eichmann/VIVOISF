package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasMemberInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasMemberInverseIterator theOrganizationHasMemberInverseIterator = (OrganizationHasMemberInverseIterator)findAncestorWithClass(this, OrganizationHasMemberInverseIterator.class);
			pageContext.getOut().print(theOrganizationHasMemberInverseIterator.getHasMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

