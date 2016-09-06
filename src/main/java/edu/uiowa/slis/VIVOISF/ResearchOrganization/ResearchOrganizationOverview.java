package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			if (!theResearchOrganization.commitNeeded) {
				pageContext.getOut().print(theResearchOrganization.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			return theResearchOrganization.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing ResearchOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			ResearchOrganization theResearchOrganization = (ResearchOrganization)findAncestorWithClass(this, ResearchOrganization.class);
			theResearchOrganization.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for overview tag ");
		}
	}
}

