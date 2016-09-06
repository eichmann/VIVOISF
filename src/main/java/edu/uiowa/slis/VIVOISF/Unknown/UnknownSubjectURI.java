package edu.uiowa.slis.VIVOISF.Unknown;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UnknownSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UnknownSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(UnknownSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Unknown theUnknown = (Unknown)findAncestorWithClass(this, Unknown.class);
			if (!theUnknown.commitNeeded) {
				pageContext.getOut().print(theUnknown.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Unknown for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Unknown for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Unknown theUnknown = (Unknown)findAncestorWithClass(this, Unknown.class);
			return theUnknown.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Unknown for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Unknown for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Unknown theUnknown = (Unknown)findAncestorWithClass(this, Unknown.class);
			theUnknown.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Unknown for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Unknown for subjectURI tag ");
		}
	}
}

