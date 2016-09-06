package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratorySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratorySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratorySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			if (!theLaboratory.commitNeeded) {
				pageContext.getOut().print(theLaboratory.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			return theLaboratory.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Laboratory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			theLaboratory.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for subjectURI tag ");
		}
	}
}

