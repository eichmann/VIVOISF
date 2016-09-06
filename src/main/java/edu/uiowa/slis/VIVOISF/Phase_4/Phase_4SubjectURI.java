package edu.uiowa.slis.VIVOISF.Phase_4;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_4SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_4SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_4SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase_4 thePhase_4 = (Phase_4)findAncestorWithClass(this, Phase_4.class);
			if (!thePhase_4.commitNeeded) {
				pageContext.getOut().print(thePhase_4.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_4 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_4 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Phase_4 thePhase_4 = (Phase_4)findAncestorWithClass(this, Phase_4.class);
			return thePhase_4.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase_4 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_4 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Phase_4 thePhase_4 = (Phase_4)findAncestorWithClass(this, Phase_4.class);
			thePhase_4.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_4 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_4 for subjectURI tag ");
		}
	}
}

