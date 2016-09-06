package edu.uiowa.slis.VIVOISF.Competition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompetitionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompetitionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CompetitionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Competition theCompetition = (Competition)findAncestorWithClass(this, Competition.class);
			if (!theCompetition.commitNeeded) {
				pageContext.getOut().print(theCompetition.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Competition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Competition for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Competition theCompetition = (Competition)findAncestorWithClass(this, Competition.class);
			return theCompetition.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Competition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Competition for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Competition theCompetition = (Competition)findAncestorWithClass(this, Competition.class);
			theCompetition.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Competition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Competition for label tag ");
		}
	}
}

