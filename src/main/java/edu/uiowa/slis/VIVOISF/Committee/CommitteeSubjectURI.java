package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Committee theCommittee = (Committee)findAncestorWithClass(this, Committee.class);
			if (!theCommittee.commitNeeded) {
				pageContext.getOut().print(theCommittee.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Committee theCommittee = (Committee)findAncestorWithClass(this, Committee.class);
			return theCommittee.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Committee for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Committee theCommittee = (Committee)findAncestorWithClass(this, Committee.class);
			theCommittee.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for subjectURI tag ");
		}
	}
}

