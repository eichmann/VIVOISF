package edu.uiowa.slis.VIVOISF.Logo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LogoSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LogoSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LogoSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Logo theLogo = (Logo)findAncestorWithClass(this, Logo.class);
			if (!theLogo.commitNeeded) {
				pageContext.getOut().print(theLogo.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Logo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Logo for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Logo theLogo = (Logo)findAncestorWithClass(this, Logo.class);
			return theLogo.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Logo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Logo for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Logo theLogo = (Logo)findAncestorWithClass(this, Logo.class);
			theLogo.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Logo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Logo for subjectURI tag ");
		}
	}
}

