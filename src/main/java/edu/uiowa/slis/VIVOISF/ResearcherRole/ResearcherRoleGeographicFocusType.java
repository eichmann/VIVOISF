package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleGeographicFocusIterator theResearcherRoleGeographicFocusIterator = (ResearcherRoleGeographicFocusIterator)findAncestorWithClass(this, ResearcherRoleGeographicFocusIterator.class);
			pageContext.getOut().print(theResearcherRoleGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

