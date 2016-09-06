package edu.uiowa.slis.VIVOISF.SynonymType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTypeSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTypeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTypeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SynonymType theSynonymType = (SynonymType)findAncestorWithClass(this, SynonymType.class);
			if (!theSynonymType.commitNeeded) {
				pageContext.getOut().print(theSynonymType.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			SynonymType theSynonymType = (SynonymType)findAncestorWithClass(this, SynonymType.class);
			return theSynonymType.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing SynonymType for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			SynonymType theSynonymType = (SynonymType)findAncestorWithClass(this, SynonymType.class);
			theSynonymType.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for subjectURI tag ");
		}
	}
}

