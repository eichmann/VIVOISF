package edu.uiowa.slis.VIVOISF.Child;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChildSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChildSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ChildSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Child theChild = (Child)findAncestorWithClass(this, Child.class);
			if (!theChild.commitNeeded) {
				pageContext.getOut().print(theChild.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Child for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Child for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Child theChild = (Child)findAncestorWithClass(this, Child.class);
			return theChild.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Child for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Child for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Child theChild = (Child)findAncestorWithClass(this, Child.class);
			theChild.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Child for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Child for subjectURI tag ");
		}
	}
}

