package edu.uiowa.slis.VIVOISF.PrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrincipalInvestigatorRoleHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrincipalInvestigatorRoleHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(PrincipalInvestigatorRoleHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrincipalInvestigatorRole thePrincipalInvestigatorRole = (PrincipalInvestigatorRole)findAncestorWithClass(this, PrincipalInvestigatorRole.class);
			if (!thePrincipalInvestigatorRole.commitNeeded) {
				pageContext.getOut().print(thePrincipalInvestigatorRole.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrincipalInvestigatorRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			PrincipalInvestigatorRole thePrincipalInvestigatorRole = (PrincipalInvestigatorRole)findAncestorWithClass(this, PrincipalInvestigatorRole.class);
			return thePrincipalInvestigatorRole.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrincipalInvestigatorRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			PrincipalInvestigatorRole thePrincipalInvestigatorRole = (PrincipalInvestigatorRole)findAncestorWithClass(this, PrincipalInvestigatorRole.class);
			thePrincipalInvestigatorRole.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing PrincipalInvestigatorRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for hideFromDisplay tag ");
		}
	}
}

