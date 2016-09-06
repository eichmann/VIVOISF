package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			if (!theResearchOrganization.commitNeeded) {
				pageContext.getOut().print(theResearchOrganization.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			return theResearchOrganization.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing ResearchOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			theResearchOrganization.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for abbreviation tag ");
		}
	}
}

