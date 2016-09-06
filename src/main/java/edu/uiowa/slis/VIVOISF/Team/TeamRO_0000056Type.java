package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamRO_0000056Iterator theTeamRO_0000056Iterator = (TeamRO_0000056Iterator)findAncestorWithClass(this, TeamRO_0000056Iterator.class);
			pageContext.getOut().print(theTeamRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

