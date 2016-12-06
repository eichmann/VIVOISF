package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameCurrencyARIterator theResearcherRole = (ResearcherRoleNameCurrencyARIterator)findAncestorWithClass(this, ResearcherRoleNameCurrencyARIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

