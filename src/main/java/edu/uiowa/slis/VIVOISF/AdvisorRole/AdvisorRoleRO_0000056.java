package edu.uiowa.slis.VIVOISF.AdvisorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisorRoleRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisorRoleRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisorRoleRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdvisorRoleRO_0000056Iterator theAdvisorRoleRO_0000056Iterator = (AdvisorRoleRO_0000056Iterator)findAncestorWithClass(this, AdvisorRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theAdvisorRoleRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisorRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisorRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

