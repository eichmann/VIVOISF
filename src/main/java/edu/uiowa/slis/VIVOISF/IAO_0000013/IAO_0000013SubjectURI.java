package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013 theIAO_0000013 = (IAO_0000013)findAncestorWithClass(this, IAO_0000013.class);
			if (!theIAO_0000013.commitNeeded) {
				pageContext.getOut().print(theIAO_0000013.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			IAO_0000013 theIAO_0000013 = (IAO_0000013)findAncestorWithClass(this, IAO_0000013.class);
			return theIAO_0000013.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing IAO_0000013 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			IAO_0000013 theIAO_0000013 = (IAO_0000013)findAncestorWithClass(this, IAO_0000013.class);
			theIAO_0000013.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for subjectURI tag ");
		}
	}
}

