package edu.uiowa.slis.VIVOISF.PresenterRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresenterRoleBFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresenterRoleBFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PresenterRoleBFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PresenterRoleBFO_0000054Iterator thePresenterRoleBFO_0000054Iterator = (PresenterRoleBFO_0000054Iterator)findAncestorWithClass(this, PresenterRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(thePresenterRoleBFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PresenterRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresenterRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

