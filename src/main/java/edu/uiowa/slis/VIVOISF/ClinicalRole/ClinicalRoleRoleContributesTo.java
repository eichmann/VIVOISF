package edu.uiowa.slis.VIVOISF.ClinicalRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalRoleRoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalRoleRoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalRoleRoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalRoleRoleContributesToIterator theClinicalRoleRoleContributesToIterator = (ClinicalRoleRoleContributesToIterator)findAncestorWithClass(this, ClinicalRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theClinicalRoleRoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

