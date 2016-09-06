package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationTranslatorIterator theOrganizationTranslatorIterator = (OrganizationTranslatorIterator)findAncestorWithClass(this, OrganizationTranslatorIterator.class);
			pageContext.getOut().print(theOrganizationTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for translator tag ");
		}
		return SKIP_BODY;
	}
}

