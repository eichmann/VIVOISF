package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governing theNon_self_governing = (Non_self_governing)findAncestorWithClass(this, Non_self_governing.class);
			if (!theNon_self_governing.commitNeeded) {
				pageContext.getOut().print(theNon_self_governing.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Non_self_governing theNon_self_governing = (Non_self_governing)findAncestorWithClass(this, Non_self_governing.class);
			return theNon_self_governing.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Non_self_governing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Non_self_governing theNon_self_governing = (Non_self_governing)findAncestorWithClass(this, Non_self_governing.class);
			theNon_self_governing.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for subjectURI tag ");
		}
	}
}

