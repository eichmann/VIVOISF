package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameCurrencyITIterator theResearcherRole = (ResearcherRoleNameCurrencyITIterator)findAncestorWithClass(this, ResearcherRoleNameCurrencyITIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

