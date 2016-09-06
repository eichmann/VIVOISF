package edu.uiowa.slis.VIVOISF.IAO_0000027;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000027SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000027SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000027SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000027 theIAO_0000027 = (IAO_0000027)findAncestorWithClass(this, IAO_0000027.class);
			if (!theIAO_0000027.commitNeeded) {
				pageContext.getOut().print(theIAO_0000027.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000027 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000027 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			IAO_0000027 theIAO_0000027 = (IAO_0000027)findAncestorWithClass(this, IAO_0000027.class);
			return theIAO_0000027.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing IAO_0000027 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000027 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			IAO_0000027 theIAO_0000027 = (IAO_0000027)findAncestorWithClass(this, IAO_0000027.class);
			theIAO_0000027.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000027 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000027 for subjectURI tag ");
		}
	}
}

