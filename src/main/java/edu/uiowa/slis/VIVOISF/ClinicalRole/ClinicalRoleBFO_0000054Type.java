package edu.uiowa.slis.VIVOISF.ClinicalRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalRoleBFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalRoleBFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalRoleBFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalRoleBFO_0000054Iterator theClinicalRoleBFO_0000054Iterator = (ClinicalRoleBFO_0000054Iterator)findAncestorWithClass(this, ClinicalRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theClinicalRoleBFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

