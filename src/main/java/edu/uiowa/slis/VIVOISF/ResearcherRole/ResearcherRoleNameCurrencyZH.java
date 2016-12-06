package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameCurrencyZHIterator theResearcherRole = (ResearcherRoleNameCurrencyZHIterator)findAncestorWithClass(this, ResearcherRoleNameCurrencyZHIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

