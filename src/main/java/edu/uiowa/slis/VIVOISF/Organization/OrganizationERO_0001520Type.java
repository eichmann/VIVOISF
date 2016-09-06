package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationERO_0001520Iterator theOrganizationERO_0001520Iterator = (OrganizationERO_0001520Iterator)findAncestorWithClass(this, OrganizationERO_0001520Iterator.class);
			pageContext.getOut().print(theOrganizationERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

