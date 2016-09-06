package edu.uiowa.slis.VIVOISF.Met;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MetSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MetSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MetSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Met theMet = (Met)findAncestorWithClass(this, Met.class);
			if (!theMet.commitNeeded) {
				pageContext.getOut().print(theMet.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Met for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Met for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Met theMet = (Met)findAncestorWithClass(this, Met.class);
			return theMet.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Met for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Met for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Met theMet = (Met)findAncestorWithClass(this, Met.class);
			theMet.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Met for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Met for subjectURI tag ");
		}
	}
}

