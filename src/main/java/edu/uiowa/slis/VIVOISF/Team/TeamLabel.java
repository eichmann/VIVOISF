package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Team theTeam = (Team)findAncestorWithClass(this, Team.class);
			if (!theTeam.commitNeeded) {
				pageContext.getOut().print(theTeam.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Team for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Team theTeam = (Team)findAncestorWithClass(this, Team.class);
			return theTeam.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Team for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Team theTeam = (Team)findAncestorWithClass(this, Team.class);
			theTeam.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Team for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for label tag ");
		}
	}
}

