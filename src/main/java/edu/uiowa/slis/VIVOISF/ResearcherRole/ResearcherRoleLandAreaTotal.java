package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleLandAreaTotalIterator theResearcherRole = (ResearcherRoleLandAreaTotalIterator)findAncestorWithClass(this, ResearcherRoleLandAreaTotalIterator.class);
			pageContext.getOut().print(theResearcherRole.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

