package edu.uiowa.slis.VIVOISF.ClinicalRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalRoleRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalRoleRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalRoleRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalRoleRO_0000052Iterator theClinicalRoleRO_0000052Iterator = (ClinicalRoleRO_0000052Iterator)findAncestorWithClass(this, ClinicalRoleRO_0000052Iterator.class);
			pageContext.getOut().print(theClinicalRoleRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

