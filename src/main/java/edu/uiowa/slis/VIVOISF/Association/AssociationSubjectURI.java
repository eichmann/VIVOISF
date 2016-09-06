package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			if (!theAssociation.commitNeeded) {
				pageContext.getOut().print(theAssociation.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Association for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			return theAssociation.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Association for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			theAssociation.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Association for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for subjectURI tag ");
		}
	}
}

