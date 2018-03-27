package edu.uiowa.slis.VIVOISF.ReflexiveProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReflexivePropertySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReflexivePropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ReflexivePropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ReflexiveProperty theReflexiveProperty = (ReflexiveProperty)findAncestorWithClass(this, ReflexiveProperty.class);
			if (!theReflexiveProperty.commitNeeded) {
				pageContext.getOut().print(theReflexiveProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ReflexiveProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReflexiveProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ReflexiveProperty theReflexiveProperty = (ReflexiveProperty)findAncestorWithClass(this, ReflexiveProperty.class);
			return theReflexiveProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ReflexiveProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReflexiveProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ReflexiveProperty theReflexiveProperty = (ReflexiveProperty)findAncestorWithClass(this, ReflexiveProperty.class);
			theReflexiveProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ReflexiveProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReflexiveProperty for subjectURI tag ");
		}
	}
}

