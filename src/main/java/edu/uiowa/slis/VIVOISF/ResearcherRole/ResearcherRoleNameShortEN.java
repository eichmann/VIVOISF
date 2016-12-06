package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameShortENIterator theResearcherRole = (ResearcherRoleNameShortENIterator)findAncestorWithClass(this, ResearcherRoleNameShortENIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

