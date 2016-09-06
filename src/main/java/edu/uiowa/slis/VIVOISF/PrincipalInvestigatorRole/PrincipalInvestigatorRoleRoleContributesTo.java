package edu.uiowa.slis.VIVOISF.PrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrincipalInvestigatorRoleRoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrincipalInvestigatorRoleRoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(PrincipalInvestigatorRoleRoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrincipalInvestigatorRoleRoleContributesToIterator thePrincipalInvestigatorRoleRoleContributesToIterator = (PrincipalInvestigatorRoleRoleContributesToIterator)findAncestorWithClass(this, PrincipalInvestigatorRoleRoleContributesToIterator.class);
			pageContext.getOut().print(thePrincipalInvestigatorRoleRoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing PrincipalInvestigatorRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

