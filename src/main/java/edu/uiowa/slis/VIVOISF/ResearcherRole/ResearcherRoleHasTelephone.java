package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasTelephoneIterator theResearcherRoleHasTelephoneIterator = (ResearcherRoleHasTelephoneIterator)findAncestorWithClass(this, ResearcherRoleHasTelephoneIterator.class);
			pageContext.getOut().print(theResearcherRoleHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

