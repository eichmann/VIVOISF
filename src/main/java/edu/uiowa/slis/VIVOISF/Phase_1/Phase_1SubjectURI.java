package edu.uiowa.slis.VIVOISF.Phase_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_1SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_1SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_1SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase_1 thePhase_1 = (Phase_1)findAncestorWithClass(this, Phase_1.class);
			if (!thePhase_1.commitNeeded) {
				pageContext.getOut().print(thePhase_1.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_1 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_1 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Phase_1 thePhase_1 = (Phase_1)findAncestorWithClass(this, Phase_1.class);
			return thePhase_1.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase_1 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_1 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Phase_1 thePhase_1 = (Phase_1)findAncestorWithClass(this, Phase_1.class);
			thePhase_1.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_1 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_1 for subjectURI tag ");
		}
	}
}

