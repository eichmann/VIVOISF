package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleGDPTotalInCurrentPricesIterator theResearcherRole = (ResearcherRoleGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, ResearcherRoleGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theResearcherRole.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

