package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameListENIterator theResearcherRole = (ResearcherRoleNameListENIterator)findAncestorWithClass(this, ResearcherRoleNameListENIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

