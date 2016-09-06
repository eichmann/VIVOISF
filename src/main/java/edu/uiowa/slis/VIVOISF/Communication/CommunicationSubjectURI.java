package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Communication theCommunication = (Communication)findAncestorWithClass(this, Communication.class);
			if (!theCommunication.commitNeeded) {
				pageContext.getOut().print(theCommunication.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Communication theCommunication = (Communication)findAncestorWithClass(this, Communication.class);
			return theCommunication.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Communication for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Communication theCommunication = (Communication)findAncestorWithClass(this, Communication.class);
			theCommunication.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for subjectURI tag ");
		}
	}
}

