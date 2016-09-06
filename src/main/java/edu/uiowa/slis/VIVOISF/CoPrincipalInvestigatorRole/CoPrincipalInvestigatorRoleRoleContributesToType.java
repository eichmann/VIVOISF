package edu.uiowa.slis.VIVOISF.CoPrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoPrincipalInvestigatorRoleRoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoPrincipalInvestigatorRoleRoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoPrincipalInvestigatorRoleRoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoPrincipalInvestigatorRoleRoleContributesToIterator theCoPrincipalInvestigatorRoleRoleContributesToIterator = (CoPrincipalInvestigatorRoleRoleContributesToIterator)findAncestorWithClass(this, CoPrincipalInvestigatorRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theCoPrincipalInvestigatorRoleRoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoPrincipalInvestigatorRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

