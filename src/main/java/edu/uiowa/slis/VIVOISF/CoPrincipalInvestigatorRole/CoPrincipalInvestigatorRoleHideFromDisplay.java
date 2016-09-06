package edu.uiowa.slis.VIVOISF.CoPrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoPrincipalInvestigatorRoleHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoPrincipalInvestigatorRoleHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(CoPrincipalInvestigatorRoleHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CoPrincipalInvestigatorRole theCoPrincipalInvestigatorRole = (CoPrincipalInvestigatorRole)findAncestorWithClass(this, CoPrincipalInvestigatorRole.class);
			if (!theCoPrincipalInvestigatorRole.commitNeeded) {
				pageContext.getOut().print(theCoPrincipalInvestigatorRole.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CoPrincipalInvestigatorRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			CoPrincipalInvestigatorRole theCoPrincipalInvestigatorRole = (CoPrincipalInvestigatorRole)findAncestorWithClass(this, CoPrincipalInvestigatorRole.class);
			return theCoPrincipalInvestigatorRole.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing CoPrincipalInvestigatorRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			CoPrincipalInvestigatorRole theCoPrincipalInvestigatorRole = (CoPrincipalInvestigatorRole)findAncestorWithClass(this, CoPrincipalInvestigatorRole.class);
			theCoPrincipalInvestigatorRole.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing CoPrincipalInvestigatorRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for hideFromDisplay tag ");
		}
	}
}

