package edu.uiowa.slis.VIVOISF.PresentingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresentingProcessSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresentingProcessSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PresentingProcessSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PresentingProcess thePresentingProcess = (PresentingProcess)findAncestorWithClass(this, PresentingProcess.class);
			if (!thePresentingProcess.commitNeeded) {
				pageContext.getOut().print(thePresentingProcess.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PresentingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresentingProcess for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PresentingProcess thePresentingProcess = (PresentingProcess)findAncestorWithClass(this, PresentingProcess.class);
			return thePresentingProcess.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PresentingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresentingProcess for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PresentingProcess thePresentingProcess = (PresentingProcess)findAncestorWithClass(this, PresentingProcess.class);
			thePresentingProcess.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PresentingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresentingProcess for subjectURI tag ");
		}
	}
}

