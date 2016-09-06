package edu.uiowa.slis.VIVOISF.Phase_2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_2SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_2SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_2SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase_2 thePhase_2 = (Phase_2)findAncestorWithClass(this, Phase_2.class);
			if (!thePhase_2.commitNeeded) {
				pageContext.getOut().print(thePhase_2.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_2 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_2 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Phase_2 thePhase_2 = (Phase_2)findAncestorWithClass(this, Phase_2.class);
			return thePhase_2.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase_2 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_2 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Phase_2 thePhase_2 = (Phase_2)findAncestorWithClass(this, Phase_2.class);
			thePhase_2.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_2 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_2 for subjectURI tag ");
		}
	}
}

