package edu.uiowa.slis.VIVOISF.ERO_0000224;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000224SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000224SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000224SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000224 theERO_0000224 = (ERO_0000224)findAncestorWithClass(this, ERO_0000224.class);
			if (!theERO_0000224.commitNeeded) {
				pageContext.getOut().print(theERO_0000224.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000224 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000224 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ERO_0000224 theERO_0000224 = (ERO_0000224)findAncestorWithClass(this, ERO_0000224.class);
			return theERO_0000224.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ERO_0000224 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000224 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ERO_0000224 theERO_0000224 = (ERO_0000224)findAncestorWithClass(this, ERO_0000224.class);
			theERO_0000224.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000224 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000224 for subjectURI tag ");
		}
	}
}

