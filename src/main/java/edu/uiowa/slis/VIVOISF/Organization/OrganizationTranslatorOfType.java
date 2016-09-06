package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationTranslatorOfIterator theOrganizationTranslatorOfIterator = (OrganizationTranslatorOfIterator)findAncestorWithClass(this, OrganizationTranslatorOfIterator.class);
			pageContext.getOut().print(theOrganizationTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

