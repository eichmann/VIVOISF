package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Team theTeam = (Team)findAncestorWithClass(this, Team.class);
			if (!theTeam.commitNeeded) {
				pageContext.getOut().print(theTeam.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Team for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Team theTeam = (Team)findAncestorWithClass(this, Team.class);
			return theTeam.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Team for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Team theTeam = (Team)findAncestorWithClass(this, Team.class);
			theTeam.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Team for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for overview tag ");
		}
	}
}

