package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			if (!theResearcherRole.commitNeeded) {
				pageContext.getOut().print(theResearcherRole.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			return theResearcherRole.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing ResearcherRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			theResearcherRole.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hideFromDisplay tag ");
		}
	}
}

