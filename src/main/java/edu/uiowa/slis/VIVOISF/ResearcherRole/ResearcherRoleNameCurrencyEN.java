package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameCurrencyENIterator theResearcherRole = (ResearcherRoleNameCurrencyENIterator)findAncestorWithClass(this, ResearcherRoleNameCurrencyENIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

