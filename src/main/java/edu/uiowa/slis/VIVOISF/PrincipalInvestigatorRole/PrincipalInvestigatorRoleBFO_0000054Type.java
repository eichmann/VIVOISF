package edu.uiowa.slis.VIVOISF.PrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrincipalInvestigatorRoleBFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrincipalInvestigatorRoleBFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PrincipalInvestigatorRoleBFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrincipalInvestigatorRoleBFO_0000054Iterator thePrincipalInvestigatorRoleBFO_0000054Iterator = (PrincipalInvestigatorRoleBFO_0000054Iterator)findAncestorWithClass(this, PrincipalInvestigatorRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(thePrincipalInvestigatorRoleBFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrincipalInvestigatorRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

