package edu.uiowa.slis.VIVOISF.Kin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KinSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KinSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(KinSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Kin theKin = (Kin)findAncestorWithClass(this, Kin.class);
			if (!theKin.commitNeeded) {
				pageContext.getOut().print(theKin.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Kin for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kin for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Kin theKin = (Kin)findAncestorWithClass(this, Kin.class);
			return theKin.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Kin for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kin for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Kin theKin = (Kin)findAncestorWithClass(this, Kin.class);
			theKin.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Kin for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kin for subjectURI tag ");
		}
	}
}

