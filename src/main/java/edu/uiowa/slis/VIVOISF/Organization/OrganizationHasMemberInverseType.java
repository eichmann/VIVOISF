package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasMemberInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasMemberInverseIterator theOrganizationHasMemberInverseIterator = (OrganizationHasMemberInverseIterator)findAncestorWithClass(this, OrganizationHasMemberInverseIterator.class);
			pageContext.getOut().print(theOrganizationHasMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

