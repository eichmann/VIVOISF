package edu.uiowa.slis.VIVOISF.InstantMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstantMessageSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstantMessageSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(InstantMessageSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			InstantMessage theInstantMessage = (InstantMessage)findAncestorWithClass(this, InstantMessage.class);
			if (!theInstantMessage.commitNeeded) {
				pageContext.getOut().print(theInstantMessage.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InstantMessage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InstantMessage for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			InstantMessage theInstantMessage = (InstantMessage)findAncestorWithClass(this, InstantMessage.class);
			return theInstantMessage.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing InstantMessage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InstantMessage for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			InstantMessage theInstantMessage = (InstantMessage)findAncestorWithClass(this, InstantMessage.class);
			theInstantMessage.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing InstantMessage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InstantMessage for subjectURI tag ");
		}
	}
}

