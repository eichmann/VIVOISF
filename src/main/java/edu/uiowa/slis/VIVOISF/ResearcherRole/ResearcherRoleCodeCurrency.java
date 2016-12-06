package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCodeCurrencyIterator theResearcherRole = (ResearcherRoleCodeCurrencyIterator)findAncestorWithClass(this, ResearcherRoleCodeCurrencyIterator.class);
			pageContext.getOut().print(theResearcherRole.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

