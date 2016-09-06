package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratorySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratorySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratorySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			if (!theCoreLaboratory.commitNeeded) {
				pageContext.getOut().print(theCoreLaboratory.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			return theCoreLaboratory.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CoreLaboratory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			theCoreLaboratory.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for subjectURI tag ");
		}
	}
}

