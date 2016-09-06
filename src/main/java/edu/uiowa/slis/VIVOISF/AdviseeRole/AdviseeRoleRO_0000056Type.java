package edu.uiowa.slis.VIVOISF.AdviseeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdviseeRoleRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdviseeRoleRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AdviseeRoleRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdviseeRoleRO_0000056Iterator theAdviseeRoleRO_0000056Iterator = (AdviseeRoleRO_0000056Iterator)findAncestorWithClass(this, AdviseeRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theAdviseeRoleRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AdviseeRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdviseeRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

