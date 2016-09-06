package edu.uiowa.slis.VIVOISF.Competition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompetitionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompetitionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CompetitionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Competition theCompetition = (Competition)findAncestorWithClass(this, Competition.class);
			if (!theCompetition.commitNeeded) {
				pageContext.getOut().print(theCompetition.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Competition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Competition for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Competition theCompetition = (Competition)findAncestorWithClass(this, Competition.class);
			return theCompetition.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Competition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Competition for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Competition theCompetition = (Competition)findAncestorWithClass(this, Competition.class);
			theCompetition.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Competition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Competition for subjectURI tag ");
		}
	}
}

