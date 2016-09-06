package edu.uiowa.slis.VIVOISF.PrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrincipalInvestigatorRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrincipalInvestigatorRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PrincipalInvestigatorRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrincipalInvestigatorRole thePrincipalInvestigatorRole = (PrincipalInvestigatorRole)findAncestorWithClass(this, PrincipalInvestigatorRole.class);
			if (!thePrincipalInvestigatorRole.commitNeeded) {
				pageContext.getOut().print(thePrincipalInvestigatorRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrincipalInvestigatorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PrincipalInvestigatorRole thePrincipalInvestigatorRole = (PrincipalInvestigatorRole)findAncestorWithClass(this, PrincipalInvestigatorRole.class);
			return thePrincipalInvestigatorRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrincipalInvestigatorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PrincipalInvestigatorRole thePrincipalInvestigatorRole = (PrincipalInvestigatorRole)findAncestorWithClass(this, PrincipalInvestigatorRole.class);
			thePrincipalInvestigatorRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PrincipalInvestigatorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrincipalInvestigatorRole for label tag ");
		}
	}
}

