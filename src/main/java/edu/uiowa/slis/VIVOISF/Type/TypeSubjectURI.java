package edu.uiowa.slis.VIVOISF.Type;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TypeSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TypeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TypeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Type theType = (Type)findAncestorWithClass(this, Type.class);
			if (!theType.commitNeeded) {
				pageContext.getOut().print(theType.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Type for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Type for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Type theType = (Type)findAncestorWithClass(this, Type.class);
			return theType.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Type for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Type for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Type theType = (Type)findAncestorWithClass(this, Type.class);
			theType.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Type for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Type for subjectURI tag ");
		}
	}
}

