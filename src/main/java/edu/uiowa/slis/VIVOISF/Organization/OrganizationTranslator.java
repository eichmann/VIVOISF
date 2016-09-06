package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationTranslatorIterator theOrganizationTranslatorIterator = (OrganizationTranslatorIterator)findAncestorWithClass(this, OrganizationTranslatorIterator.class);
			pageContext.getOut().print(theOrganizationTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for translator tag ");
		}
		return SKIP_BODY;
	}
}

