package edu.uiowa.slis.VIVOISF.ERO_0000012;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000012SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000012SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000012SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000012 theERO_0000012 = (ERO_0000012)findAncestorWithClass(this, ERO_0000012.class);
			if (!theERO_0000012.commitNeeded) {
				pageContext.getOut().print(theERO_0000012.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000012 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000012 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ERO_0000012 theERO_0000012 = (ERO_0000012)findAncestorWithClass(this, ERO_0000012.class);
			return theERO_0000012.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ERO_0000012 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000012 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ERO_0000012 theERO_0000012 = (ERO_0000012)findAncestorWithClass(this, ERO_0000012.class);
			theERO_0000012.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000012 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000012 for subjectURI tag ");
		}
	}
}

