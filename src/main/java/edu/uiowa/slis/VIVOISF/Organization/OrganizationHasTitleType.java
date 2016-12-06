package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasTitleIterator theOrganizationHasTitleIterator = (OrganizationHasTitleIterator)findAncestorWithClass(this, OrganizationHasTitleIterator.class);
			pageContext.getOut().print(theOrganizationHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

