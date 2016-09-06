package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			if (!theResearcherRole.commitNeeded) {
				pageContext.getOut().print(theResearcherRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			return theResearcherRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ResearcherRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			theResearcherRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for label tag ");
		}
	}
}

