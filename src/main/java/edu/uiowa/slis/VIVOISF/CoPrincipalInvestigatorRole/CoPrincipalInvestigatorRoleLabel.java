package edu.uiowa.slis.VIVOISF.CoPrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoPrincipalInvestigatorRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoPrincipalInvestigatorRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CoPrincipalInvestigatorRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CoPrincipalInvestigatorRole theCoPrincipalInvestigatorRole = (CoPrincipalInvestigatorRole)findAncestorWithClass(this, CoPrincipalInvestigatorRole.class);
			if (!theCoPrincipalInvestigatorRole.commitNeeded) {
				pageContext.getOut().print(theCoPrincipalInvestigatorRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CoPrincipalInvestigatorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CoPrincipalInvestigatorRole theCoPrincipalInvestigatorRole = (CoPrincipalInvestigatorRole)findAncestorWithClass(this, CoPrincipalInvestigatorRole.class);
			return theCoPrincipalInvestigatorRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CoPrincipalInvestigatorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CoPrincipalInvestigatorRole theCoPrincipalInvestigatorRole = (CoPrincipalInvestigatorRole)findAncestorWithClass(this, CoPrincipalInvestigatorRole.class);
			theCoPrincipalInvestigatorRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CoPrincipalInvestigatorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for label tag ");
		}
	}
}

