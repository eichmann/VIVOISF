package edu.uiowa.slis.VIVOISF.ARG_2000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000009SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000009SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000009SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000009 theARG_2000009 = (ARG_2000009)findAncestorWithClass(this, ARG_2000009.class);
			if (!theARG_2000009.commitNeeded) {
				pageContext.getOut().print(theARG_2000009.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000009 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000009 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ARG_2000009 theARG_2000009 = (ARG_2000009)findAncestorWithClass(this, ARG_2000009.class);
			return theARG_2000009.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ARG_2000009 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000009 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ARG_2000009 theARG_2000009 = (ARG_2000009)findAncestorWithClass(this, ARG_2000009.class);
			theARG_2000009.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000009 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000009 for subjectURI tag ");
		}
	}
}

