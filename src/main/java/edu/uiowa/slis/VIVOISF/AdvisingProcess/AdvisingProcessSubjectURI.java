package edu.uiowa.slis.VIVOISF.AdvisingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisingProcessSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisingProcessSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisingProcessSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AdvisingProcess theAdvisingProcess = (AdvisingProcess)findAncestorWithClass(this, AdvisingProcess.class);
			if (!theAdvisingProcess.commitNeeded) {
				pageContext.getOut().print(theAdvisingProcess.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingProcess for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AdvisingProcess theAdvisingProcess = (AdvisingProcess)findAncestorWithClass(this, AdvisingProcess.class);
			return theAdvisingProcess.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AdvisingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingProcess for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AdvisingProcess theAdvisingProcess = (AdvisingProcess)findAncestorWithClass(this, AdvisingProcess.class);
			theAdvisingProcess.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingProcess for subjectURI tag ");
		}
	}
}

