package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Webpage theWebpage = (Webpage)findAncestorWithClass(this, Webpage.class);
			if (!theWebpage.commitNeeded) {
				pageContext.getOut().print(theWebpage.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Webpage theWebpage = (Webpage)findAncestorWithClass(this, Webpage.class);
			return theWebpage.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Webpage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Webpage theWebpage = (Webpage)findAncestorWithClass(this, Webpage.class);
			theWebpage.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for subjectURI tag ");
		}
	}
}

