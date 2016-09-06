package edu.uiowa.slis.VIVOISF.FormattedName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FormattedNameSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FormattedNameSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FormattedNameSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FormattedName theFormattedName = (FormattedName)findAncestorWithClass(this, FormattedName.class);
			if (!theFormattedName.commitNeeded) {
				pageContext.getOut().print(theFormattedName.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FormattedName for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FormattedName for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			FormattedName theFormattedName = (FormattedName)findAncestorWithClass(this, FormattedName.class);
			return theFormattedName.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing FormattedName for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FormattedName for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			FormattedName theFormattedName = (FormattedName)findAncestorWithClass(this, FormattedName.class);
			theFormattedName.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing FormattedName for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FormattedName for subjectURI tag ");
		}
	}
}

