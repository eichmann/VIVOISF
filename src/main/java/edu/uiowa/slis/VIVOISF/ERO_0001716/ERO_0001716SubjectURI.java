package edu.uiowa.slis.VIVOISF.ERO_0001716;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001716SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001716SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001716SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001716 theERO_0001716 = (ERO_0001716)findAncestorWithClass(this, ERO_0001716.class);
			if (!theERO_0001716.commitNeeded) {
				pageContext.getOut().print(theERO_0001716.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001716 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001716 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ERO_0001716 theERO_0001716 = (ERO_0001716)findAncestorWithClass(this, ERO_0001716.class);
			return theERO_0001716.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ERO_0001716 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001716 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ERO_0001716 theERO_0001716 = (ERO_0001716)findAncestorWithClass(this, ERO_0001716.class);
			theERO_0001716.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001716 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001716 for subjectURI tag ");
		}
	}
}

