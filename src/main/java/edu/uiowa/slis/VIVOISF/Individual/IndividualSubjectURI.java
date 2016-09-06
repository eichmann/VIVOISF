package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			if (!theIndividual.commitNeeded) {
				pageContext.getOut().print(theIndividual.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			return theIndividual.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Individual for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Individual theIndividual = (Individual)findAncestorWithClass(this, Individual.class);
			theIndividual.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for subjectURI tag ");
		}
	}
}

