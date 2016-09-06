package edu.uiowa.slis.VIVOISF.Parent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ParentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ParentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ParentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Parent theParent = (Parent)findAncestorWithClass(this, Parent.class);
			if (!theParent.commitNeeded) {
				pageContext.getOut().print(theParent.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Parent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Parent for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Parent theParent = (Parent)findAncestorWithClass(this, Parent.class);
			return theParent.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Parent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Parent for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Parent theParent = (Parent)findAncestorWithClass(this, Parent.class);
			theParent.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Parent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Parent for subjectURI tag ");
		}
	}
}

