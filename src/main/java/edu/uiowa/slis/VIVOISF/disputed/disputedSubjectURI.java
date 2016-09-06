package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			disputed thedisputed = (disputed)findAncestorWithClass(this, disputed.class);
			if (!thedisputed.commitNeeded) {
				pageContext.getOut().print(thedisputed.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			disputed thedisputed = (disputed)findAncestorWithClass(this, disputed.class);
			return thedisputed.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing disputed for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			disputed thedisputed = (disputed)findAncestorWithClass(this, disputed.class);
			thedisputed.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for subjectURI tag ");
		}
	}
}

