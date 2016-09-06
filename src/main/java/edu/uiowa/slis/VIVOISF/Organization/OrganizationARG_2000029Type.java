package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationARG_2000029Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationARG_2000029Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationARG_2000029Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationARG_2000029Iterator theOrganizationARG_2000029Iterator = (OrganizationARG_2000029Iterator)findAncestorWithClass(this, OrganizationARG_2000029Iterator.class);
			pageContext.getOut().print(theOrganizationARG_2000029Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for ARG_2000029 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for ARG_2000029 tag ");
		}
		return SKIP_BODY;
	}
}

