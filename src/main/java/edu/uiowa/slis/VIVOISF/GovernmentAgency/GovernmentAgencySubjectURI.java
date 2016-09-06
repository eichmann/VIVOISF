package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			if (!theGovernmentAgency.commitNeeded) {
				pageContext.getOut().print(theGovernmentAgency.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			return theGovernmentAgency.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing GovernmentAgency for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			GovernmentAgency theGovernmentAgency = (GovernmentAgency)findAncestorWithClass(this, GovernmentAgency.class);
			theGovernmentAgency.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for subjectURI tag ");
		}
	}
}

