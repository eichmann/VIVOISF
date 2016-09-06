package edu.uiowa.slis.VIVOISF.ERO_0001260;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001260SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001260SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001260SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001260 theERO_0001260 = (ERO_0001260)findAncestorWithClass(this, ERO_0001260.class);
			if (!theERO_0001260.commitNeeded) {
				pageContext.getOut().print(theERO_0001260.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001260 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001260 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ERO_0001260 theERO_0001260 = (ERO_0001260)findAncestorWithClass(this, ERO_0001260.class);
			return theERO_0001260.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ERO_0001260 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001260 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ERO_0001260 theERO_0001260 = (ERO_0001260)findAncestorWithClass(this, ERO_0001260.class);
			theERO_0001260.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001260 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001260 for subjectURI tag ");
		}
	}
}

