package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Team theTeam = (Team)findAncestorWithClass(this, Team.class);
			if (!theTeam.commitNeeded) {
				pageContext.getOut().print(theTeam.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Team for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Team theTeam = (Team)findAncestorWithClass(this, Team.class);
			return theTeam.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Team for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Team theTeam = (Team)findAncestorWithClass(this, Team.class);
			theTeam.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Team for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for subjectURI tag ");
		}
	}
}

