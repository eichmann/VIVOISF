package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			if (!theResearchOrganization.commitNeeded) {
				pageContext.getOut().print(theResearchOrganization.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			return theResearchOrganization.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ResearchOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			theResearchOrganization.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for label tag ");
		}
	}
}

