package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			if (!thegeographical_region.commitNeeded) {
				pageContext.getOut().print(thegeographical_region.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			return thegeographical_region.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing geographical_region for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			thegeographical_region.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for subjectURI tag ");
		}
	}
}

