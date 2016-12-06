package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameCurrencyFRIterator theResearcherRole = (ResearcherRoleNameCurrencyFRIterator)findAncestorWithClass(this, ResearcherRoleNameCurrencyFRIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

