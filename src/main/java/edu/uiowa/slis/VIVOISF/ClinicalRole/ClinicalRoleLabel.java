package edu.uiowa.slis.VIVOISF.ClinicalRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalRole theClinicalRole = (ClinicalRole)findAncestorWithClass(this, ClinicalRole.class);
			if (!theClinicalRole.commitNeeded) {
				pageContext.getOut().print(theClinicalRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ClinicalRole theClinicalRole = (ClinicalRole)findAncestorWithClass(this, ClinicalRole.class);
			return theClinicalRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ClinicalRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ClinicalRole theClinicalRole = (ClinicalRole)findAncestorWithClass(this, ClinicalRole.class);
			theClinicalRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalRole for label tag ");
		}
	}
}

