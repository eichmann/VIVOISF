package edu.uiowa.slis.VIVOISF.ERO_0000007;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000007SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000007SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000007SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000007 theERO_0000007 = (ERO_0000007)findAncestorWithClass(this, ERO_0000007.class);
			if (!theERO_0000007.commitNeeded) {
				pageContext.getOut().print(theERO_0000007.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000007 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000007 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ERO_0000007 theERO_0000007 = (ERO_0000007)findAncestorWithClass(this, ERO_0000007.class);
			return theERO_0000007.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ERO_0000007 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000007 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ERO_0000007 theERO_0000007 = (ERO_0000007)findAncestorWithClass(this, ERO_0000007.class);
			theERO_0000007.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000007 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000007 for subjectURI tag ");
		}
	}
}

