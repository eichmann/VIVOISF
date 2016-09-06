package edu.uiowa.slis.VIVOISF.Colleague;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ColleagueSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ColleagueSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ColleagueSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Colleague theColleague = (Colleague)findAncestorWithClass(this, Colleague.class);
			if (!theColleague.commitNeeded) {
				pageContext.getOut().print(theColleague.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Colleague for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Colleague for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Colleague theColleague = (Colleague)findAncestorWithClass(this, Colleague.class);
			return theColleague.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Colleague for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Colleague for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Colleague theColleague = (Colleague)findAncestorWithClass(this, Colleague.class);
			theColleague.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Colleague for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Colleague for subjectURI tag ");
		}
	}
}

