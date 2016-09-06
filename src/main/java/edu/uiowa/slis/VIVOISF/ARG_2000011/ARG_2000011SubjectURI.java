package edu.uiowa.slis.VIVOISF.ARG_2000011;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000011SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000011SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000011SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000011 theARG_2000011 = (ARG_2000011)findAncestorWithClass(this, ARG_2000011.class);
			if (!theARG_2000011.commitNeeded) {
				pageContext.getOut().print(theARG_2000011.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000011 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000011 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ARG_2000011 theARG_2000011 = (ARG_2000011)findAncestorWithClass(this, ARG_2000011.class);
			return theARG_2000011.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ARG_2000011 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000011 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ARG_2000011 theARG_2000011 = (ARG_2000011)findAncestorWithClass(this, ARG_2000011.class);
			theARG_2000011.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000011 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000011 for subjectURI tag ");
		}
	}
}

