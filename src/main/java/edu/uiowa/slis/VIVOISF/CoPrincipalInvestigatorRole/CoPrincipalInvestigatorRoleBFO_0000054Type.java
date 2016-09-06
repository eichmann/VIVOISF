package edu.uiowa.slis.VIVOISF.CoPrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoPrincipalInvestigatorRoleBFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoPrincipalInvestigatorRoleBFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CoPrincipalInvestigatorRoleBFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoPrincipalInvestigatorRoleBFO_0000054Iterator theCoPrincipalInvestigatorRoleBFO_0000054Iterator = (CoPrincipalInvestigatorRoleBFO_0000054Iterator)findAncestorWithClass(this, CoPrincipalInvestigatorRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theCoPrincipalInvestigatorRoleBFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoPrincipalInvestigatorRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoPrincipalInvestigatorRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

