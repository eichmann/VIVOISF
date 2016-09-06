package edu.uiowa.slis.VIVOISF.LeaderRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LeaderRoleBFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LeaderRoleBFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LeaderRoleBFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LeaderRoleBFO_0000054Iterator theLeaderRoleBFO_0000054Iterator = (LeaderRoleBFO_0000054Iterator)findAncestorWithClass(this, LeaderRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theLeaderRoleBFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LeaderRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LeaderRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

