package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationTranslatorOfIterator theResearchOrganizationTranslatorOfIterator = (ResearchOrganizationTranslatorOfIterator)findAncestorWithClass(this, ResearchOrganizationTranslatorOfIterator.class);
			pageContext.getOut().print(theResearchOrganizationTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

