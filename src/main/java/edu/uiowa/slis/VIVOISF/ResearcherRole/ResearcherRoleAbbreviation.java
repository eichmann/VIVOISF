package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			if (!theResearcherRole.commitNeeded) {
				pageContext.getOut().print(theResearcherRole.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			return theResearcherRole.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing ResearcherRole for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			theResearcherRole.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for abbreviation tag ");
		}
	}
}

