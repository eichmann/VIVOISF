package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameCurrencyRUIterator theResearcherRole = (ResearcherRoleNameCurrencyRUIterator)findAncestorWithClass(this, ResearcherRoleNameCurrencyRUIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}
