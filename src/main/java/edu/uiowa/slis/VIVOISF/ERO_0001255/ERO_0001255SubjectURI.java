package edu.uiowa.slis.VIVOISF.ERO_0001255;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001255SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001255SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001255SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001255 theERO_0001255 = (ERO_0001255)findAncestorWithClass(this, ERO_0001255.class);
			if (!theERO_0001255.commitNeeded) {
				pageContext.getOut().print(theERO_0001255.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001255 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001255 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ERO_0001255 theERO_0001255 = (ERO_0001255)findAncestorWithClass(this, ERO_0001255.class);
			return theERO_0001255.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ERO_0001255 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001255 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ERO_0001255 theERO_0001255 = (ERO_0001255)findAncestorWithClass(this, ERO_0001255.class);
			theERO_0001255.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001255 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001255 for subjectURI tag ");
		}
	}
}

