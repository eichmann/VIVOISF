package edu.uiowa.slis.VIVOISF.PresenterRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresenterRoleRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresenterRoleRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(PresenterRoleRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PresenterRoleRO_0000052Iterator thePresenterRoleRO_0000052Iterator = (PresenterRoleRO_0000052Iterator)findAncestorWithClass(this, PresenterRoleRO_0000052Iterator.class);
			pageContext.getOut().print(thePresenterRoleRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing PresenterRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresenterRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

