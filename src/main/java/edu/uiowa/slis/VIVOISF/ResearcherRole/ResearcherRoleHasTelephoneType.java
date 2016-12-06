package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasTelephoneIterator theResearcherRoleHasTelephoneIterator = (ResearcherRoleHasTelephoneIterator)findAncestorWithClass(this, ResearcherRoleHasTelephoneIterator.class);
			pageContext.getOut().print(theResearcherRoleHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

