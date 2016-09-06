package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NameSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Name theName = (Name)findAncestorWithClass(this, Name.class);
			if (!theName.commitNeeded) {
				pageContext.getOut().print(theName.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Name for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Name theName = (Name)findAncestorWithClass(this, Name.class);
			return theName.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Name for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Name theName = (Name)findAncestorWithClass(this, Name.class);
			theName.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Name for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for subjectURI tag ");
		}
	}
}

