package edu.uiowa.slis.VIVOISF.CoPrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoPrincipalInvestigatorRoleRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoPrincipalInvestigatorRoleRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CoPrincipalInvestigatorRoleRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoPrincipalInvestigatorRoleRO_0000056Iterator theCoPrincipalInvestigatorRoleRO_0000056Iterator = (CoPrincipalInvestigatorRoleRO_0000056Iterator)findAncestorWithClass(this, CoPrincipalInvestigatorRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theCoPrincipalInvestigatorRoleRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoPrincipalInvestigatorRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

