package edu.uiowa.slis.VIVOISF.PrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrincipalInvestigatorRoleRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrincipalInvestigatorRoleRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PrincipalInvestigatorRoleRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrincipalInvestigatorRoleRO_0000052Iterator thePrincipalInvestigatorRoleRO_0000052Iterator = (PrincipalInvestigatorRoleRO_0000052Iterator)findAncestorWithClass(this, PrincipalInvestigatorRoleRO_0000052Iterator.class);
			pageContext.getOut().print(thePrincipalInvestigatorRoleRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrincipalInvestigatorRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

