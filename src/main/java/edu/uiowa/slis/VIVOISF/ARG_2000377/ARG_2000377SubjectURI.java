package edu.uiowa.slis.VIVOISF.ARG_2000377;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000377SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000377SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000377SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000377 theARG_2000377 = (ARG_2000377)findAncestorWithClass(this, ARG_2000377.class);
			if (!theARG_2000377.commitNeeded) {
				pageContext.getOut().print(theARG_2000377.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000377 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000377 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ARG_2000377 theARG_2000377 = (ARG_2000377)findAncestorWithClass(this, ARG_2000377.class);
			return theARG_2000377.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ARG_2000377 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000377 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ARG_2000377 theARG_2000377 = (ARG_2000377)findAncestorWithClass(this, ARG_2000377.class);
			theARG_2000377.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000377 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000377 for subjectURI tag ");
		}
	}
}

