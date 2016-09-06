package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Website theWebsite = (Website)findAncestorWithClass(this, Website.class);
			if (!theWebsite.commitNeeded) {
				pageContext.getOut().print(theWebsite.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Website for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Website theWebsite = (Website)findAncestorWithClass(this, Website.class);
			return theWebsite.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Website for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Website theWebsite = (Website)findAncestorWithClass(this, Website.class);
			theWebsite.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Website for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for subjectURI tag ");
		}
	}
}

