package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamRO_0000053Iterator theTeamRO_0000053Iterator = (TeamRO_0000053Iterator)findAncestorWithClass(this, TeamRO_0000053Iterator.class);
			pageContext.getOut().print(theTeamRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

